package modtutorial.modtutorial.item;

import modtutorial.modtutorial.MODTUTORIAL;
import modtutorial.modtutorial.item.custom.ModEspada;
import modtutorial.modtutorial.item.custom.ModPico;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODTUTORIAL.MODID);

    public static final RegistryObject<Item> TENSHI= ITEMS.register("tenshi", () -> new ModEspada(Tiers.NETHERITE,6,0.1f,
            new Item.Properties()));
    public static final RegistryObject<Item> PYLON = ITEMS.register("pylon", () -> new ModPico(Tiers.NETHERITE,1,0.001f,
            new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
