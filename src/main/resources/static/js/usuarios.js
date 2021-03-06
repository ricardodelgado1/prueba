// Call the dataTables jQuery plugin
$(document).ready(function() {


  $('#usuarios').DataTable();
});

async function cargarUsuarios(){

  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({a: 1, b: 'Textual content'})
  });
  const usuarios = await request.json();

 let listadoHtml = '';
  for(let usuario of usuarios){
      let usuariohtml = '<tr> <td>'+usuario.id+'</td> <td>'+usuario.nombre+''+usuario.apellido+'</td> <td>'+usuario.email+'</td><td>'+usuario.telefono+'</td><td>  <a href="#" class="btn btn-danger btn-circle btn-sm"> <i class="fas fa-trash"></i></a></td></tr>'

      listadoHtml += usuariohtml;
  }

document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

}

