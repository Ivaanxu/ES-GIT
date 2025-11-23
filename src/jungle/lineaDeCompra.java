package jungle;

public class LineaDeCompra
{
    private int cod_lc;
    private static int num_cod_lc;
    private int cantidad_lc;
    private float precio_lc;
    private Medicamento m;
    num_cod_lc = 0;
    public LineaDeCompra(int cantidad_, Medicamento m_)
    {
        this.cod_lc = num_cod_lc = num_cod_lc + 1;

<<<<<<< HEAD
public class LineaDeCompra
{
    private int cod_lc;
    private static int num_cod_lc = 0;
    private int cantidad_lc;
    private float precio_lc;
    private Medicamento m;

    public LineaDeCompra(int cantidad_, Medicamento m_)
    {
        this.cod_lc = num_cod_lc++;
=======
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class LineaDeCompra
{
    private int cod_lc;
    private int cantidad_lc;
    private float precio_lc;
    private Medicamento m;
    public LineaDeCompra(int cantidad_, Medicamento m_)
    {
>>>>>>> ramaAlumno3
>>>>>>> 3525981822a39c6b4eb7f36f9d0f0e03f4341af2
        this.cantidad_lc = cantidad_;
        this.m = m_;
        this.precio_lc = this.m.getPrecioMedicamento() * this.cantidad_lc;
    }
<<<<<<< HEAD
    //Metodos observadores
=======
<<<<<<< HEAD

    //Metodos observadores
=======
>>>>>>> ramaAlumno3
>>>>>>> 3525981822a39c6b4eb7f36f9d0f0e03f4341af2
    public int getCod_lc()
    {
        return this.cod_lc;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> ramaAlumno3
>>>>>>> 3525981822a39c6b4eb7f36f9d0f0e03f4341af2
    public int getCantidad_lc()
    {
        return this.cantidad_lc;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> ramaAlumno3
>>>>>>> 3525981822a39c6b4eb7f36f9d0f0e03f4341af2
    public float getPrecio_lc()
    {
        return this.precio_lc;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> ramaAlumno3
>>>>>>> 3525981822a39c6b4eb7f36f9d0f0e03f4341af2
    public Medicamento getMedicamento()
    {
        return this.m;
    }
<<<<<<< HEAD
    public int getNum_cod_lc()
    {
        return this.num_cod_lc;
    }
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> ramaAlumno3
>>>>>>> 3525981822a39c6b4eb7f36f9d0f0e03f4341af2
