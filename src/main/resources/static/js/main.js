const hello = () => alert("It work (somehow)");
hello();


getProducts = () => {
  return fetch("/api/products")
  .then(response => response.json())

}

getCurrentOffer = () => {
    return fetch("/api/current-offer")
        .then(response => response.json());
}

const createProductHtml = (productData) => {
    const template = `
        <div>
            <h4>${productData.name</h4>
            <span>%{productData.price}</span>

            <button data-id="${productData.id">Add to cart</button>
        </div>

    `;
    const productEl = document.createElement('li')
    productEl.innerHTML = template.trim();

    return productEl
}


document.addEventListener("DOMContentLoaded", () => {
    const productListEl = document.querySelector("#productList");
       getProducts()
            .then(productsAsJsonObj => productsAsJsonObj.map(createProductHtml))
            .then(productsAsHtmlEl => {
                productsAsHtmlEl.forEach(productEl => productListEl.appendChild(productEl));
            })


})