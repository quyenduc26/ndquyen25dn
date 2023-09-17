var id=0;
function Add(){
    id++;
    var pname = document.getElementById('pname').value;
    var quantity = parseInt(document.getElementById('quantity').value);
    var unitprice =  parseInt(document.getElementById('unitprice').value);
    var discount =  parseInt(document.getElementById('discount').value);
    var subtotal = quantity*unitprice*(1-discount/100);
    var row="<tr>";
    row+='<td>'+id+'</td>';
    row+='<td>'+pname+'</td>';
    row+='<td>'+quantity+'</td>';
    row+='<td>'+unitprice+'</td>';
    row+='<td>'+discount+'</td>';
    row+='<td>'+subtotal+'</td>';
    row+='</tr>';
    document.getElementById('tbl').innerHTML+=row;
}
function Clear(){
    document.getElementById('pname').value=" ";
    document.getElementById('quantity').value=" "
    document.getElementById('unitprice').value=" "
    document.getElementById('discount').value=" "


}