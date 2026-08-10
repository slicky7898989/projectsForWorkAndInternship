const foodAdd = "http://localhost:8080/food/addFood";
const foodRead = "http://localhost:8080/food/seeFood";


document.getElementById("sub").addEventListener("click",addFood);
document.getElementById("see").addEventListener("click",seeFood);


/** This entire js file
 * is for the getting the 
 * user input and
 * outputting the databse
 * which containts the
 * user input
*/
function addFood()
{
    let foodVal =  document.getElementById("Food").value;
  
    let see = 
    {
        "FoodName": `${foodVal}`
    }
    let putIn = 
    {
        method:"POST",
        headers: 
        {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify(see)
    }

    fetch(foodAdd,putIn)
    .then(info => info.json())


}

function seeFood()
{
    let seen = document.getElementById("look");
    const see = 
    {
        method:"GET"        
    }

    fetch(foodRead,see)
    .then(see => see.json())
    .then(see =>
        seen.value += JSON.stringify(see)
    )
}