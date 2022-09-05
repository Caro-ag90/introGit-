async function obtenerPersonajes(url_api){
    //realizar peticiòn de tipo get
    const resp = await fetch(url_api, {
        method: 'GET'
    })
    console.log(resp)
    //obtener datos de la petición
    const data = await resp.json
    console.log(data)

}

function main (){
    const url= "https://rickandmortyapi.com/api/character"
    obtenerPersonajes(url)

}