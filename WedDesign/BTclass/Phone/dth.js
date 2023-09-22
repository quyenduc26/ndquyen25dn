function Add(){
    let pname = document.getElementById('name').value;
    let img = document.getElementById('image').value;
    let price = document.getElementById('price').value;
    let src=img.slice(12);
    let html= `
      <div class="col-lg-4 border">
        <img class="img w-100 h-auto pb-2 p-3" src="${src}" alt="${pname}">
        <h4 >${pname}</h4>
        <p class="text-danger pt-2">${price+"đ"}</p>
      </div>
    `
    document.getElementById('products').innerHTML+=html;
}