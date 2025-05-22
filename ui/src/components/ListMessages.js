import {useEffect, useState} from 'react';
import {Link} from 'react-router-dom'
import {restCall} from "../utils/RestCallUtil";

export const ListMessages = props => {
    const [apiListMessages, setApiListMessages] = useState({});

    useEffect(() => {
        if(apiListMessages.status === undefined){
            restCall('GET', `${props.globalData.serverURI}api`, setApiListMessages);
        }
    },[apiListMessages, props.globalData.serverURI])

    return (
        <>
            <Link to="message/">Message</Link>
            <br/>Here is the list.<br/>
            <>
                {(apiListMessages.status!==undefined)?(<>
                    {(apiListMessages.status===200)?(<ul>
                        {apiListMessages.data.map(row=>(
                            <li key={row.id}>
                                {row.title}, {row.description}
                            </li>
                        ))}
                    </ul>):(<>Error loading data</>)}
                </>):(<>Loading Data</>)}
            </>
        </>
    );
}