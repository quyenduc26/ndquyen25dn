function Hello(){
    var name= prompt("Nhap ten vao: ");
    document.write("May kh phai ten "+ name +". May ten Teo`");
  }
function S_Square(){
    let a= parseInt(prompt("Nhap canh: "));
    function dientich(a){
      return a*a;
    }
    let s= dientich(a);
    document.write("dien tich hinh vuong la "+s);
  }
function S_Rectangle(){
    let a= parseInt(prompt("Nhap so a: "));
    let b= parseInt(prompt("Nhap so b: "));
    function dientich(a,b){
      return a*b;
    }
    let s= dientich(a,b);
    document.write("dien tich hinh chu nhat la "+s);
  }
  function Check(){
    var nb=document.getElementById("input").value;
    var announce;
    if(nb==0){
      announce="0 co gi";
    }
    else if(nb>0){
      announce="so duong";
    }
    else{
      announce="so am";
    }
    document.write(announce);
  }