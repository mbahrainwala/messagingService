import {Outlet} from "react-router-dom";

export const Root = props =>{return (
        <div>
            <div>
                <Outlet />
            </div>
        </div>
    );
}