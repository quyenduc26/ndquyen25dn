let man = [
    {
        id: 1,
        name: "Quần nam đen",
        code: "QUANNAM1",
        price: "200.000",
        image: "https://levents.asia/wp-content/uploads/2022/09/z3734003651099_b011a0d84f107eff996a0d73a1252344-1536x1536.jpg"
    },
    {
        id: 2,
        name: "Quần nam trắng",
        code: "QUANNAM2",
        price: "300.000",
        image: "https://4men.com.vn/thumbs/2023/06/quan-jean-trang-tron-qj025-34262-p.jpg"
    },
    {
        id: 3,
        name: "Quần nam be",
        code: "QUANNAM3",
        price: "400.000",
        image: "https://levents.asia/wp-content/uploads/2022/09/z3734003837021_096e3d52a49bfae4b5d023cd25580ece-1536x1536.jpg"
    },
    {
        id: 4,
        name: "Quần nam jean",
        code: "QUANNAM4",
        price: "500.000",
        image: "https://levents.asia/wp-content/uploads/2022/10/z3734003639749_9af5788d065fc1d9b85396c1012e948a-1536x1536.jpg"
    },
    
]
let woman = [
    {
        id: 1,
        name: "Váy nữ đen",
        code: "QUANNU1",
        price: "200.000",
        image: "https://lamia.com.vn/storage/anh-seo/dam-ho-lung-dang-xoe-mau-den-kd011-9.jpg"
    },
    {
        id: 2,
        name: "Váy nữ trắng",
        code: "QUANNU2",
        price: "300.000",
        image: "https://salt.tikicdn.com/cache/w400/ts/product/17/11/88/34a15c9520b2899ea62a3cbd7e40795f.jpg"
    },
    {
        id: 3,
        name: "Váy nữ be",
        code: "QUANNU3",
        price: "400.000",
        image: "https://bizweb.dktcdn.net/thumb/1024x1024/100/403/511/products/o1cn01qbw72e1qncngfnoat9003520.jpg"
    },
    {
        id: 4,
        name: "Váy nữ jean",
        code: "QUANNU4",
        price: "500.000",
        image: "https://cdn-img-v2.webbnc.net/uploadv2/web/12/12971/product/2022/03/28/03/18/1648395578_276162268_2478642225626004_1891541577794812033_n.j.jpg"
    },
    
]
function showList(){
    for(var i=0; i < man.length; i++ ){
        var html =`
            <div class="col-lg-4 border">
            <img class="img w-100 h-auto pb-2 p-3" src="${man[i].image}" alt="${man[i].name}">
            <h4 >${man[i].name}</h4>
            <p class="text-danger pt-2">${man[i].price+"đ"}</p>
        </div>
        `
    }
}
