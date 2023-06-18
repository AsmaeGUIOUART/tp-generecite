import java.util.ArrayList;
import java.util.List;

public class MetierProduitImp implements IMetier<Produit>{
    private List<Produit> produitList=new ArrayList<>();
    @Override
    public void add(Produit produit) {
        produitList.add(produit);

    }

    @Override
    public List<Produit> getAll() {
        return produitList;
    }

    @Override
    public Produit findById(long id) {
        for (int i = 0; i < produitList.size(); i++) {
            Produit m;
            m=produitList.get(i);
            if(m.getId()==id){
                return m;
            }

        }
        return null;
    }

    @Override
    public void delete(long id) {
        Produit produit=findById(id);
        produitList.remove(produit);

    }
}

