import {Outlet} from "react-router-dom";
import {Header} from "./Header";
import {Footer} from "./Footer";
import {useStyle} from "../utils/UseStyles";

export const Root = props =>{return (
        <div>
            <Header/>
                <div>
                    <Outlet />
                </div>
            <Footer/>
        </div>
    );
}