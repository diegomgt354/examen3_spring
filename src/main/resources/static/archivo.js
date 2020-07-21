function eliminarCategorias(id){
	swal({
		  title: "Esta seguro de eliminar esta Categoria?",
		  text: "Una vez eliminado, ¡no podrá recuperar este archivo!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminarCategorias/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  });
		    swal("¡Su archivo de Categoria ha sido eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listarCategorias";
		    	}
		    });
		  } else {
		    swal("¡Tu archivo de Categorias está a salvo!");
		  }
		});
}

function eliminarProveedores(id){
	swal({
		  title: "Esta seguro de eliminar este Proveedor?",
		  text: "Una vez eliminado, ¡no podrá recuperar este archivo!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminarProveedores/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  });
		    swal("¡Su archivo de Proveedor ha sido eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listarProveedores";
		    	}
		    });
		  } else {
		    swal("¡Tu archivo de Proveedor está a salvo!");
		  }
		});
}

function eliminarProductos(id){
	swal({
		  title: "Esta seguro de eliminar este Producto?",
		  text: "Una vez eliminado, ¡no podrá recuperar este Producto!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminarProductos/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  });
		    swal("¡Su archivo de Producto ha sido eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listarProductos";
		    	}
		    });
		  } else {
		    swal("¡Tu archivo de Productos está a salvo!");
		  }
		});
}

