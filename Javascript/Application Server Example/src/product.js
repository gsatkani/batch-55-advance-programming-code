const pname = document.getElementById('product-name')
const price = document.getElementById('product-price')
const quantity = document.getElementById('product-quantity')
var sum = ''
fetch('http://localhost:3000/products')
    .then(response => {
        // handle response
        // converting received data to json
        return response.json()
    })
    .then(data => {
        // Handle the data
        console.log(data)
        data.forEach(x => {
            sum = sum + `
              <div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">${x.name}</h5>
    <p class="card-text">${x.price}</p>
    <p class="card-text">${x.quantity}</p>
    <a href="#" class="btn btn-primary">Click to view product</a>
  </div>
</div>`
        });
        document.getElementById('display-product-list').innerHTML = sum
    })


function addProduct(event) {
    let product = {
        "name": pname.value,
        "price": price.value,
        "quantity": quantity.value
    }
    alert("Add Product Button Clicked")
        // stop submitting the form

    let url = 'http://localhost:3000/products'
        // Post the data into the server - communicate
    fetch(url, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(product)
    }).then(response => {
        console.log(response)
        if (response.status === 201) {
            alert("Product Added")
        }
    })

}