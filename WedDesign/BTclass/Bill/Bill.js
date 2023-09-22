var id=0;
var total=0;
function Add(){
    var newRow = document.getElementById('tbl').insertRow(id);
    ++id;
    var name = document.getElementById('name').value;
    var quantity = parseInt(document.getElementById('quantity').value);
    var unitprice =  parseInt(document.getElementById('unitprice').value);
    var subtotal = quantity*unitprice;
    total+=subtotal;
    newRow.insertCell(0).innerHTML=id;
    newRow.insertCell(1).innerHTML=name;
    newRow.insertCell(2).innerHTML=quantity;
    newRow.insertCell(3).innerHTML=unitprice;
    newRow.insertCell(4).innerHTML=subtotal;


    // document.getElementById('tbl').innerHTML+=row;
    document.getElementById('total').innerHTML="$"+total;
}

function Clear(){
    document.getElementById('name').value=" ";
    document.getElementById('quantity').value=" "
    document.getElementById('unitprice').value=" "


}