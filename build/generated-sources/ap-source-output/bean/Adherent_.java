package bean;

import bean.Enfant;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-27T11:56:39")
@StaticMetamodel(Adherent.class)
public class Adherent_ { 

    public static volatile SingularAttribute<Adherent, String> emailAutreParent;
    public static volatile SingularAttribute<Adherent, String> telAutreParent;
    public static volatile SingularAttribute<Adherent, String> prenomAutreParent;
    public static volatile SingularAttribute<Adherent, Integer> tel;
    public static volatile SingularAttribute<Adherent, Long> id;
    public static volatile ListAttribute<Adherent, Enfant> enfants;
    public static volatile SingularAttribute<Adherent, String> prenom;
    public static volatile SingularAttribute<Adherent, String> nom;
    public static volatile SingularAttribute<Adherent, String> email;
    public static volatile SingularAttribute<Adherent, String> nomAutreParent;

}