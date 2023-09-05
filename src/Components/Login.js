import React, { useState } from 'react'
import Bookservice from'./Bookservice'
import './Login.css'
import { useNavigate } from 'react-router';


function Login() {
    
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const[cred, setCred] = useState([]);
  let navigate = useNavigate('');

  const handleUsernameChange = (e) => {
    setUsername(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  let canLog = false;
  const handleSubmit = (e) => {
        e.preventDefault();
        console.log(`Username: ${username}, Password: ${password}`)

        try{
            Bookservice.getBooks()
            .then((response)=>{
                console.log(response.data)
                setCred(response.data)
            })
            console.log("Fetched");
            cred.forEach( (detail) => {
                detail.custDetails.forEach( (d) => {
                    if(d.custEmail === username && d.custPass === password){
                        canLog = true;
                    }
                })
            })
            console.log(canLog)
            if(canLog===true){
                navigate('/Home')
                alert('Logged In')
            }
            else{
                throw new Error('The entered user credentials are incorrect')
            }
        }
        catch(error){
            alert('Invalid login')
            console.error('Error logging in', error)
        }
    }
    

  return (
      <div className='login'>
        <div className='login-container'>
        <h1 className='login-font-color'>E-Book Emporium</h1>
        <h2 className='login-phrase'>Where Epic Adventures Await on Every Page!</h2>
          <div className='form-container'>
            <h1 className='loginfont'>Sign In</h1>
            <form onSubmit={handleSubmit}>
              <div>
                <input
                  className='logincred'
                  placeholder='Username'
                  type="text"
                  name="username"
                  value={username}
                  onChange={handleUsernameChange}
                  required/>
              </div>
              <div>
                <input
                  className='logincred'
                  placeholder='Password'
                  type="password"
                  name="password"
                  value={password}
                  onChange={handlePasswordChange}
                  required/>
              </div>
              <div>
                <button className='but' type="submit">Submit</button>
              </div>
            </form>
          </div>
      </div>
    </div>
  )
}

/* <div className='body'>
  <section>
    <span></span> 
<span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span> 
    <span></span> <span></span> <span></span> <span></span>

<div className='sigin'>

        <div className='content'>
        <h2>Sign In</h2>
       
          <div className='form'>

            <form onSubmit={handleSubmit}>

              <div className='inputBox'>
                <input
               
                  placeholder='Username'
                  type="text"
                  name="username"
                  value={username}
                  onChange={handleUsernameChange}
                  required/> <i>Username</i>
              </div>
              <div className='inputBox'>
                <input
                  
                  placeholder='Password'
                  type="password"
                  name="password"
                  value={password}
                  onChange={handlePasswordChange}
                  required/> <i>Password</i>
              </div>
              <div className='inputBox'>
                <button type="submit">Submit</button>
              </div>
            </form>
          </div>
      </div>
    </div>
    </section>
    </div>
  )
}  */

export default Login