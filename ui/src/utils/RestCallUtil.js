import axios from 'axios';
import Cookies from 'js-cookie';

function setApiData(status, data){
    return {status, data};
}

export const restCall = async (method, endpoint, setApiRet, data) =>{
    let csrfToken = Cookies.get('X_CSRF_TOKEN');
    let header = {'Content-Type': 'application/json; charset=utf-8'};
    if('GET' !== method.toUpperCase())
    {
        header["X_CSRF_TOKEN"] = csrfToken;
    }

    axios(
        {
            method: method,
            url: endpoint,
            headers:header,
            data: data
        }
    ).then((response) => {
            if(setApiRet != null){
                const apiValue = setApiData(response.status, response.data);
                setApiRet(apiValue);
            }
        }).catch((error) => {
            let errorStr;
            if(error!=null && error!==undefined && error.response!==null){
                if(error.status !== undefined)
                    errorStr = setApiData(error.status, {error: `${error.response.data.message}`});
                else
                    errorStr = setApiData(404, {error: "Error Connecting to server"});
            }else if(setApiRet != null){
                setApiData(404, {error: 'Error Connecting to server'})
            }
            setApiRet(errorStr);
        }
    );
}