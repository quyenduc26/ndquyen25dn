function Submit(){
    let checkbox = document.getElementsByName('clb');
    let price = 0;
    let radio = document.getElementsByName('job');
    let discount=0;
    for (var i = 0; i < checkbox.length; i++){
        if (checkbox[i].checked === true){
            price+=parseInt(checkbox[i].value) ;
        }
    }
    for (var i = 0; i < radio.length; i++){
        if (radio[i].checked === true){
            discount+= parseInt(radio[i].value);
        }
    }
    document.getElementById('total').innerHTML=+price*(1-discount/100);
}