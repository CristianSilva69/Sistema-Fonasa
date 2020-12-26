/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo 2019 Y730
 */
@Entity
@Table(name = "RETIRO_BRINKS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RetiroBrinks.findAll", query = "SELECT r FROM RetiroBrinks r"),
    @NamedQuery(name = "RetiroBrinks.findByIdRetiro", query = "SELECT r FROM RetiroBrinks r WHERE r.idRetiro = :idRetiro"),
    @NamedQuery(name = "RetiroBrinks.findByNumeroBolsaBillete", query = "SELECT r FROM RetiroBrinks r WHERE r.numeroBolsaBillete = :numeroBolsaBillete"),
    @NamedQuery(name = "RetiroBrinks.findByNumeroBolsaMoneda", query = "SELECT r FROM RetiroBrinks r WHERE r.numeroBolsaMoneda = :numeroBolsaMoneda"),
    @NamedQuery(name = "RetiroBrinks.findByNumeroHojaTrasnporte", query = "SELECT r FROM RetiroBrinks r WHERE r.numeroHojaTrasnporte = :numeroHojaTrasnporte"),
    @NamedQuery(name = "RetiroBrinks.findByFechaRetiro", query = "SELECT r FROM RetiroBrinks r WHERE r.fechaRetiro = :fechaRetiro"),
    @NamedQuery(name = "RetiroBrinks.findByTotalBilletes", query = "SELECT r FROM RetiroBrinks r WHERE r.totalBilletes = :totalBilletes"),
    @NamedQuery(name = "RetiroBrinks.findByTotalMonedas", query = "SELECT r FROM RetiroBrinks r WHERE r.totalMonedas = :totalMonedas"),
    @NamedQuery(name = "RetiroBrinks.findByTotalCheques", query = "SELECT r FROM RetiroBrinks r WHERE r.totalCheques = :totalCheques"),
    @NamedQuery(name = "RetiroBrinks.findByTotalEnviado", query = "SELECT r FROM RetiroBrinks r WHERE r.totalEnviado = :totalEnviado")})
public class RetiroBrinks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ID_RETIRO")
    private String idRetiro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NUMERO_BOLSA_BILLETE")
    private String numeroBolsaBillete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NUMERO_BOLSA_MONEDA")
    private String numeroBolsaMoneda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NUMERO_HOJA_TRASNPORTE")
    private String numeroHojaTrasnporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "FECHA_RETIRO")
    private String fechaRetiro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TOTAL_BILLETES")
    private String totalBilletes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TOTAL_MONEDAS")
    private String totalMonedas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TOTAL_CHEQUES")
    private String totalCheques;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TOTAL_ENVIADO")
    private String totalEnviado;

    public RetiroBrinks() {
    }

    public RetiroBrinks(String idRetiro) {
        this.idRetiro = idRetiro;
    }

    public RetiroBrinks(String idRetiro, String numeroBolsaBillete, String numeroBolsaMoneda, String numeroHojaTrasnporte, String fechaRetiro, String totalBilletes, String totalMonedas, String totalCheques, String totalEnviado) {
        this.idRetiro = idRetiro;
        this.numeroBolsaBillete = numeroBolsaBillete;
        this.numeroBolsaMoneda = numeroBolsaMoneda;
        this.numeroHojaTrasnporte = numeroHojaTrasnporte;
        this.fechaRetiro = fechaRetiro;
        this.totalBilletes = totalBilletes;
        this.totalMonedas = totalMonedas;
        this.totalCheques = totalCheques;
        this.totalEnviado = totalEnviado;
    }

    public String getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(String idRetiro) {
        this.idRetiro = idRetiro;
    }

    public String getNumeroBolsaBillete() {
        return numeroBolsaBillete;
    }

    public void setNumeroBolsaBillete(String numeroBolsaBillete) {
        this.numeroBolsaBillete = numeroBolsaBillete;
    }

    public String getNumeroBolsaMoneda() {
        return numeroBolsaMoneda;
    }

    public void setNumeroBolsaMoneda(String numeroBolsaMoneda) {
        this.numeroBolsaMoneda = numeroBolsaMoneda;
    }

    public String getNumeroHojaTrasnporte() {
        return numeroHojaTrasnporte;
    }

    public void setNumeroHojaTrasnporte(String numeroHojaTrasnporte) {
        this.numeroHojaTrasnporte = numeroHojaTrasnporte;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getTotalBilletes() {
        return totalBilletes;
    }

    public void setTotalBilletes(String totalBilletes) {
        this.totalBilletes = totalBilletes;
    }

    public String getTotalMonedas() {
        return totalMonedas;
    }

    public void setTotalMonedas(String totalMonedas) {
        this.totalMonedas = totalMonedas;
    }

    public String getTotalCheques() {
        return totalCheques;
    }

    public void setTotalCheques(String totalCheques) {
        this.totalCheques = totalCheques;
    }

    public String getTotalEnviado() {
        return totalEnviado;
    }

    public void setTotalEnviado(String totalEnviado) {
        this.totalEnviado = totalEnviado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRetiro != null ? idRetiro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetiroBrinks)) {
            return false;
        }
        RetiroBrinks other = (RetiroBrinks) object;
        if ((this.idRetiro == null && other.idRetiro != null) || (this.idRetiro != null && !this.idRetiro.equals(other.idRetiro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.RetiroBrinks[ idRetiro=" + idRetiro + " ]";
    }
    
}
