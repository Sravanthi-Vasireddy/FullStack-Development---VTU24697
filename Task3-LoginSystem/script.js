function validateForm(){

let email=document.getElementById("email").value;
let password=document.getElementById("password").value;

if(email=="" || password==""){
document.getElementById("error").innerText="All fields are required";
return false;
}

if(password.length < 6){
document.getElementById("error").innerText="Password must be at least 6 characters";
return false;
}

alert("Login Successful");

return true;
}