import {useStyle} from "../utils/UseStyles";
import {Link as RouterLink, Link} from 'react-router-dom'

export const Header = props => {
    const classes = useStyle();

    return(
        <header>
            <Link to="/">Home</Link>
            Header Goes Here
        </header>
    )
}