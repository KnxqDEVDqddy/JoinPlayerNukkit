package join;

import cn.nukkit.item.Item;
import cn.nukkit.inventory.Inventory;
import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {

    @Override
    public void onEnable(){
        getLogger().alert("§aPlugin de Join carregando\nBy Haxney_");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void aoEntrar(PlayerJoinEvent ev){
        Player p = ev.getPlayer();
        p.sendMessage("§aSeja Bem Vindo ao Servidor §e" + p.getName());
        player.getInventory().setItem(0 , Item item = Item.get(Item.Compass, 0 ,1));
        p.sendMessage("§dVoce recebeu o item representativo do servidor !");
    }
}