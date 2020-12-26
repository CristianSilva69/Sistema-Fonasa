
package Servicio;

import Modelo.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class loginService {
    
    @PersistenceContext
    EntityManager em;

    public Usuario logeado(String usuario, String clave) {
        try {
            Usuario u = em.createNamedQuery("Usuario.login", Usuario.class)
                    .setParameter("usuario", usuario)
                    .setParameter("clave", clave)
                    .getSingleResult();
            System.out.println(u.getIdTipoUsuario());
            return u;
        } catch (Exception e) {
            return null;
        }

    }
}
