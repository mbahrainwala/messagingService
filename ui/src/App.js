import {createBrowserRouter, RouterProvider} from "react-router-dom";
import {Root} from "./frameComponents/Root"
import {ListMessages} from "./components/ListMessages";
import {Message} from "./components/Message";

const serverURI= process.env.NODE_ENV==='development'?'http://127.0.0.1:9090/':'/';

function App() {
  const globalData= {
      serverURI
  };

  const router= createBrowserRouter([
    {path:"/", element:<Root globalData={globalData}/>,
        children:[
            {index:true, element:<ListMessages globalData={globalData}/>},
            {path:"message/", element:<Message globalData={globalData}/>}
        ]
    }
  ]);

  return (
    <div className="App">
      <RouterProvider router={router}/>
    </div>
  );
}

export default App;
