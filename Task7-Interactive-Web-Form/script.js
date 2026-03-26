function validateName(){
    let name = document.getElementById("name").value;

    if(name.length < 3){
        document.getElementById("name").style.border = "2px solid red";
    }else{
        document.getElementById("name").style.border = "2px solid green";
    }
}

function submitForm(){
    alert("Thank you! Your feedback has been submitted.");
}