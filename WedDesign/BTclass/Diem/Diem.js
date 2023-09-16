function Calculate(){
    var a = document.getElementById("smt1").value;
    a=parseInt(a);
    var b = document.getElementById("smt2").value;
    b=parseInt(b);
    var c= document.getElementById("select");
    var value= c.options[c.selectedIndex].value;
    value = parseInt(value);
    var k;
    switch(value){
        case 2:{
            k=(a+(b*2))/3;
            k=parseFloat(k);
            document.getElementById("sum").value=k;
        }
        case 3:{
            k=(a+(b*3))/4;
            k=parseFloat(k);
            document.getElementById("sum").value=k;
        }
        case 4:{
            k=(a+(b*4))/5;
            k=parseFloat(k);
            document.getElementById("sum").value=k;
        }
    }
    if(k>=9){
        document.getElementById('rate').innerHTML="Hoc sinh xuat sac";
        document.getElementById('rate').color="red";
    }
    if(k>=7 && k<9){
        document.getElementById('rate').innerHTML="Hoc sinh gioi";
        document.getElementById('rate').color="blue";
    }
    if(k>=5 && k<7){
        document.getElementById('rate').innerHTML="Hoc sinh kha";
        document.getElementById('rate').color="yellow";
    }

}
function Stop(){
    document.getElementById('smt1').value=" ";
    document.getElementById('smt2').value=" ";
    document.getElementById('sum').value=" ";
    document.getElementById('rate').innerHTML=" ";

}