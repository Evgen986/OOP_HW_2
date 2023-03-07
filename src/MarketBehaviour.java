

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void replaceFromMarket(Buyer actor);
    void update();

}
