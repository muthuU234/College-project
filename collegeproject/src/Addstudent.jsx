import { useEffect } from "react";

const Addstudent=()=>{

    useEffect(()=>{
            console.log("hello i am called");
    },[])
    return (
        <>
        <center>
            <h1 color="red">
            hello dude
        </h1>
        </center>
        </>
    );
}
export default Addstudent;
