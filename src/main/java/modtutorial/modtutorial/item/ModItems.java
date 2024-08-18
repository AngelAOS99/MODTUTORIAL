package modtutorial.modtutorial.item;

import modtutorial.modtutorial.MODTUTORIAL;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODTUTORIAL.MODID);

    public static final RegistryObject<Item> ASADO=
            ITEMS.register("asado", () -> new Item(
                    new Item.Properties().stacksTo(32).fireResistant().food(
                            new FoodProperties.Builder().nutrition(3).effect(
                            () -> new MobEffectInstance(MobEffects.LEVITATION ,6000, 0),1.0f).build())
                    )
            );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
