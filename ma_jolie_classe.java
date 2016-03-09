import UneLibrarie;
import UneAutreLibrarie;

abstract class		AutreChoseEncore
{
    private SousClasseOfDoom	lol = new SousClasseOfDoom();

    public void		access()
    {
	return (this.lol);
    }

    private class	SousClasseOfDoom()
    {
	public void	rienfaire()
	{
	    ;
	}
    }
}

public class		AutreClasse extends	AutreChoseEncore
{
    public int		pv;

    public		AutreClasse()
    {
	this.pv = 42;
    }

    public void		damage()
    {
	this.pv -= 1;
    }

    public void		heal()
    {
	this.pv += 1;
    }
}

public class		Personne extends	AutreClasse
{
    public int		age;
    private String	name;

    // des builders
    public		Personne()
    {
	init_pnj();
    }

    // surcharge de Personne(void)
    public		Personne(String qui)
    {
	if (qui == "PNJ")
	    init_pnj();
	else
	    init_pj();
    }

    // des setters
    public void		set_name(String	new_name)
    {
	this.name = new_name;
    }

    // des getters
    public String	get_name()
    {
	this.methode_privee();
	return (this.name);
    }

    // des autres
    public void		augmenter_age() // méthode (fonction DANS une classe)
    {
	this.age += 1;		// pas valide (mais on y reviendra)
	//this.fonction();
    }

    private void	init()
    {
	this.age = 21;
	this.name = new String();
	this.name = "PAS DE NOM PUTAIN";
	this.name.toUpperCase();
	this.name.toLowerCase();
	int	toto = this.name.toInt();
    }
}

// C DANS UNE FONCTION LO

Personne	paul;

paul = new Personne("PNJ");

paul.age = 42;			// OK
paul.augmenter_age();		// OK, l'âge de paul vaut 43

//paul.name = "Paul";		// Erreur de compilation
paul.set_name("Paul");
System.out.println("Paul s'appelle " + paul.get_name() + " et il a " + paul.age);		// affiche le nom de paul et son âge

System.out.println(paul.pv);
paul.access().rienfaire();

///////////////////////////////////////////
