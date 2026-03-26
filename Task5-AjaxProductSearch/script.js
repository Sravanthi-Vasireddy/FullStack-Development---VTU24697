function searchProduct(){

let input=document.getElementById("search").value.toLowerCase();

fetch("products.json")
.then(response => response.json())
.then(data => {

let result="";

data.forEach(product => {

if(product.name.toLowerCase().includes(input)){
result += "<li>"+product.name+"</li>";
}

});

document.getElementById("result").innerHTML=result;

});

}