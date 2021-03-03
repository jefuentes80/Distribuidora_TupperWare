
public class Main {// v 1.0

	public static void main(String[] args) {
		
		final String nombreEmpresa = "Distribuidora TupperWare";
		
		double costoUnitario = 30; // Q45.00
		int cantidadProducto = 100;
		double totalAPagar = costoUnitario*cantidadProducto; // Q
		final double precioDeVenta = 60;
		final double IVA = 0.12;// 12%
		double TotalIVAPorUnidad = precioDeVenta*IVA;
		
		System.out.println("Costo por unidad: Q"+costoUnitario);
		System.out.println("Cantidad de producto: "+cantidadProducto);
		System.out.println("-------------------------");
		System.out.println("Total: Q"+totalAPagar);
		
		System.out.println("Venderse a: Q"+precioDeVenta);
		System.out.println("Impuesto establecido: "+IVA);
		System.out.println("Impuesto por unidad comprada: Q"+TotalIVAPorUnidad);
		
		
		int cantidadProductoVendido = 40;
		double totalcobradoSinDescuento = cantidadProductoVendido *precioDeVenta;
		
		double tipoDeDescuento = 0;
		double totalConDescuento = 0;
		if(cantidadProductoVendido>=50) {
			tipoDeDescuento = 0.05;
			totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*tipoDeDescuento);
		}
		
		if(cantidadProductoVendido>=100) {
			tipoDeDescuento = 0.15;
			totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*tipoDeDescuento);
		}
		
		if(cantidadProductoVendido>=1000) {
			tipoDeDescuento = 0.25;
			totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*tipoDeDescuento);
		}
		
		
		
		double impuestotalADeclarar =  totalConDescuento *IVA;

		double ganancias = (totalcobradoSinDescuento - (cantidadProductoVendido*costoUnitario))-impuestotalADeclarar;
		
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("Candidad Vendida: "+cantidadProductoVendido);
		System.out.println("Total sin descuento: Q"+totalcobradoSinDescuento);
		System.out.println("Total con descuento: Q"+totalConDescuento);
		System.out.println("IVA a declarar: Q"+ impuestotalADeclarar);
		System.out.println("Tipo de descuento "+ tipoDeDescuento);
		System.out.println("Ganancia: Q"+ ganancias);
		
		
	}

}
