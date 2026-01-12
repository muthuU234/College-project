import { createBrowserRouter, RouterProvider } from "react-router-dom";
import Stafflogin from "./Stafflogin";
import Studentlogin from "./Studentlogin";
import StaffDashboard from "./StaffDashboard";
import Addstudent from "./Addstudent";
function App(){

  const route=createBrowserRouter([
    {
      path:'/',
      element:<StaffDashboard/>
    },

    {
      path:'/stafflogin',
      element:<Stafflogin/>
    },
    {
      path:'/studentlogin',
      element:<Studentlogin/>
    },
    {
      path:'/staffdash',
      element:<StaffDashboard/>,
      children:[
          { index: true, element: <div>Dashboard Home</div> },
          {path:'addstudent', element:<Addstudent/>},
      ]
    }

  ])


  return (
   <RouterProvider router={route}/>
  );
}
export default App;