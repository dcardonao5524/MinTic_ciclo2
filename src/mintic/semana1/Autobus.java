public class Autobus{

    public static void main(String[] args) {
        Autobus camion1 = new Autobus("Pepe", 30, false);
        camion1.moverDerecha(5);
        camion1.gestionarWifi();
        camion1.gestionarAireAcondicionado();
        camion1.gestionarMarcha();
        camion1.gestionarMotor();
        camion1.gestionarMarcha();
        camion1.moverDerecha(5);
        camion1.recogerPasajero(2);
        camion1.gestionarPuerta();
        camion1.moverArriba(10);
        camion1.gestionarMarcha();
        camion1.gestionarPuerta();
        camion1.recogerPasajero(1);
        camion1.recogerPasajero(4);
        camion1.recogerPasajero(6);
        camion1.gestionarWifi();
        camion1.gestionarAireAcondicionado();
        camion1.gestionarMarcha();
        camion1.moverIzquierda(2);
        camion1.dejarPasajero();
        camion1.gestionarMotor();
        camion1.calcularDistanciaAcopio();
        System.out.println(camion1);
    }

    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado = false;
    private int nPasajeros = 0;
    private double cantidadDinero = 0.0;
    private double localizacionX = 0.0;
    private double localizacionY = 0.0;
    private String nombreConductor;
    private int nMaximoPasajeros;

    public Autobus(String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;
    }



    public void recogerPasajero(int estrato) {
        if(!this.enMarcha && this.puertaAbierta && this.nPasajeros < this.nMaximoPasajeros){
            int caso = estrato;
            switch (caso){
                case 0:
                    this.cantidadDinero += 1500.0;
                    this.nPasajeros ++;
                    break;

                case 1:
                    this.cantidadDinero += 1500.0;
                    this.nPasajeros ++;
                    break;

                case 2:
                    this.cantidadDinero += 1500.0;
                    this.nPasajeros ++;
                    break;


                case 3:
                    this.cantidadDinero += 2600.0;
                    this.nPasajeros ++;
                    break;

                case 4:
                    this.cantidadDinero += 2600.0;
                    this.nPasajeros ++;
                    break;

                case 5:
                    this.cantidadDinero += 3000.0;
                    this.nPasajeros ++;
                    break;

                case 6:
                    this.cantidadDinero += 3000.0;
                    this.nPasajeros ++;
                    break;
            }
        }
    }

    public void dejarPasajero() {
        if((this.puertaAbierta) && (this.enMarcha == false)){
            this.nPasajeros --;
        }
    }

    public double calcularDistanciaAcopio() {
        return Math.sqrt((Math.pow(this.localizacionX, 2) + (Math.pow(this.localizacionY, 2))));
    }

    public void gestionarPuerta() {
        if (this.enMarcha) {
            this.puertaAbierta = false;
        }else{
            if(this.enMarcha == false && puertaAbierta == false){
                this.puertaAbierta = true;
            }else{
                this.puertaAbierta = false;
            }
        }
    }
    public void gestionarAireAcondicionado () {
        if(this.motorEncendido == false){
            this.wifiEncendido = false;
        }else{
            if(this.wifiEncendido == false){
                this.wifiEncendido = true;
            }
        }
    }

    public void gestionarMotor() {
        if(this.motorEncendido == false){
            this.motorEncendido = true;
        }else{
            if(this.motorEncendido == true){
                this.motorEncendido = false;
                this.wifiEncendido = false;
                this.aireAcondicionadoActivado = false;
            }
        }
    }

    public void gestionarWifi() {
        if(this.motorEncendido == false){
            this.wifiEncendido = false;
        }else{
            if(this.wifiEncendido == false){
                wifiEncendido = true;
            }
        }
    }

    public void gestionarMarcha() { //revisar lógica.
        if (this.enMarcha == true && this.puertaAbierta == false) {
            this.enMarcha = false;
        } else {
            if ((this.motorEncendido == true) && (this.puertaAbierta)) {
                this.enMarcha = false;
            } else if (this.motorEncendido == false && this.puertaAbierta) {
                this.enMarcha = false;
            } else if ((this.motorEncendido == true) && (this.puertaAbierta == false)) {
                this.enMarcha = true;
            } else if (enMarcha) {
                this.enMarcha = false;
            }
        }
    }

    public void moverDerecha(double d) {
        if (this.enMarcha) {
            localizacionX += d;
        }else{

        }
    }

    public void moverIzquierda(double d) {
        if (this.enMarcha) {
            localizacionX -= d;
        }else{

        }

    }

    public void moverArriba(double d) {
        if (this.enMarcha) {
            localizacionY += d;
        }else{

        }
    }

    public void moverAbajo(double d) {
        if (this.enMarcha) {
            localizacionY -= d;
        }else{

        }
    }


    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "motorEncendido=" + motorEncendido +
                ", wifiEncendido=" + wifiEncendido +
                ", enMarcha=" + enMarcha +
                ", puertaAbierta=" + puertaAbierta +
                ", aireAcondicionadoActivado=" + aireAcondicionadoActivado +
                ", nPasajeros=" + nPasajeros +
                ", cantidadDinero=" + cantidadDinero +
                ", localizacionX=" + localizacionX +
                ", localizacionY=" + localizacionY +
                ", nombreConductor='" + nombreConductor + '\'' +
                ", nMaximoPasajeros=" + nMaximoPasajeros +
                '}';
    }
}