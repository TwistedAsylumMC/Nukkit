package cn.nukkit.entity.vehicle;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockIds;
import cn.nukkit.entity.Entity;
import cn.nukkit.entity.EntityType;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemIds;
import cn.nukkit.level.chunk.Chunk;
import cn.nukkit.math.Vector3f;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.player.Player;
import cn.nukkit.utils.MinecartType;

/**
 * Created by Snake1999 on 2016/1/30.
 * Package cn.nukkit.entity.item in project Nukkit.
 */
public class ChestMinecart extends AbstractMinecart<ChestMinecart> {

    public ChestMinecart(EntityType<ChestMinecart> type, Chunk chunk, CompoundTag nbt) {
        super(type, chunk, nbt);
        super.setDisplayBlock(Block.get(BlockIds.CHEST), false);
    }

    // TODO: 2016/1/30 inventory

    @Override
    public MinecartType getMinecartType() {
        return MinecartType.valueOf(1);
    }

    @Override
    public boolean isRideable(){
        return false;
    }

    @Override
    public void dropItem() {
        level.dropItem(this, Item.get(ItemIds.CHEST_MINECART));
    }

    @Override
    protected void activate(int x, int y, int z, boolean flag) {

    }

    @Override
    public boolean mountEntity(Entity entity) {
        return false;
    }

    @Override
    public boolean onInteract(Player p, Item item, Vector3f clickedPos) {
        return false;
    }
}