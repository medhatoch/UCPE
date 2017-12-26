package bean;

import bean.Adherent;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-25T20:01:54")
@StaticMetamodel(Enfant.class)
public class Enfant_ { 

    public static volatile SingularAttribute<Enfant, Date> dateDeNaissance;
    public static volatile SingularAttribute<Enfant, String> classe;
    public static volatile SingularAttribute<Enfant, Adherent> adherent;
    public static volatile SingularAttribute<Enfant, Long> id;
    public static volatile SingularAttribute<Enfant, String> nom;
    public static volatile SingularAttribute<Enfant, String> prenom;

}