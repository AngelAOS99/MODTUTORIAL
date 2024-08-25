package modtutorial.modtutorial.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ModEspada  extends SwordItem {
    public ModEspada(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);

    }
    @Override
    public boolean hurtEnemy(ItemStack itemStack,  LivingEntity entity1, LivingEntity entity2) {
        MobEffectInstance effect = new MobEffectInstance(MobEffects.WITHER,200,1);
        MobEffectInstance effect2 = new MobEffectInstance(MobEffects.ABSORPTION,100,1);
        entity1.addEffect(effect);
        entity2.addEffect(effect2);
        itemStack.hurtAndBreak(1, entity2, (p_43296_) -> {
            p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND);

        });
        return true;
    }
}


