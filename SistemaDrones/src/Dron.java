abstract class Dron {

    protected String codigo;
    protected String modelo;
    protected double distanciaKm;
    protected double pesoPaquete;
    protected double horasVuelo;
    protected double costoBase;

    public Dron() {
    }

    // GETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double getPesoPaquete() {
        return pesoPaquete;
    }

    public double getHorasVuelo() {
        return horasVuelo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    // SETTERS CON VALIDACIÓN
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Código inválido");
        }
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido");
        }
    }

    public void setDistanciaKm(double distanciaKm) {
        if (distanciaKm > 0) {
            this.distanciaKm = distanciaKm;
        } else {
            System.out.println("Distancia inválida");
        }
    }

    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete > 0) {
            this.pesoPaquete = pesoPaquete;
        } else {
            System.out.println("Peso inválido");
        }
    }
    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo > 0) {
            this.horasVuelo = horasVuelo;
        } else {
            System.out.println("Horas inválidas");
        }
    }
    // MÉTODOS ABSTRACTOS
    public abstract double calcularCostoEntrega();

    public abstract boolean validarDatos();

    // MÉTODO MOSTRAR
    public void mostrarInformacion() {
        System.out.println("Codigo       : " + codigo);
        System.out.println("Modelo       : " + modelo);
        System.out.println("Distancia    : " + distanciaKm + " km");
        System.out.println("Peso paquete : " + pesoPaquete + " kg");
        System.out.println("Horas vuelo  : " + horasVuelo + " h");
        System.out.println("Costo base   : $" + costoBase);
        System.out.println("Costo entrega: $" + calcularCostoEntrega());
    }
}