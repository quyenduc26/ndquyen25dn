function So(){
    let a=parseInt(document.getElementById('x').value);
    let kq=a%2;
    switch(kq){
        case 0:{
            document.getElementById('kq').innerHTML="La so chan";
        }
        default:{
            document.getElementById('kq').innerHTML="La so le";
        }
    }
    // document.getElementById('kq').innerHTML=" "
}