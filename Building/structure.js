/**  This entire js
 * file is for the
 * operations of
 * manipulating the
 * databse using
 * user action
 * and 
 * user input**/
document.getElementById("get").addEventListener("click",getStructures)
document.getElementById("putIn").addEventListener("click",putInStructures)
document.getElementById("EditStruc").addEventListener("click",updateStructure)
document.getElementById("deleteButton").addEventListener("click",deleteStrucre)
function getStructures()
{
    let getLink = "http://localhost:8080/building/allBuildings";
    let putStructure = document.getElementById("getOut");
 
    

    let getAll =
    {
        method:'GET',
    }

    /**The word on the left
     * of the  => in fetch()
     * is ALWAYS a ARRAY
     *  **/
    fetch(getLink,getAll)
    .then(res => res.json())
    .then(res => 
        {
            for(let a = 0 ; a<res.length;a++)
            {
                    putStructure.value += "Type Structure: "+ res[a].typeStructure + "\n";
                    putStructure.value += "Thoughts: "+res[a].thoughts+ "\n\n";
                    
            }
        })
}


function putInStructures()
{
    let structureVal = document.getElementById("gento").value;

    let postLink = "http://localhost:8080/building/addBuilding";

    let inPut = 
    {
        "typeStructure": `${structureVal}`
    }

    let putIn = 
    {
        method: "POST",
        headers: 
        {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify(inPut)

    }

    fetch(postLink,putIn)
    .then(res => res.json())
}


function updateStructure()
{
    let updateStruct = "http://localhost:8080/building/editBuilding";
    let IDForUpdate = document.getElementById("num").value;
    let convertToNumber = parseInt(IDForUpdate);
    let itemToReplace= document.getElementById("strucutre").value;

    let updateCondition = 
    {
        "ID": convertToNumber,
        "typeStructure": `${itemToReplace}`
    }

    let forUpdate = 
    {
        method: "PUT",
        headers: 
        {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify(updateCondition)
    }

    fetch(updateStruct,forUpdate)
    .then(res => res.json())
    
}

function deleteStrucre()
{
    let deleteNumber = document.getElementById("del").value;
    let deleteLink = `http://localhost:8080/building/deleteBuillding/${deleteNumber}`;

    let deleteOperation = 
    {
        method: 'DELETE'
    }

    fetch(deleteLink,deleteOperation)
    .then(res => res.json())
}