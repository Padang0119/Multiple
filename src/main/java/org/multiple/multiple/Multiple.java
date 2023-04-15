package org.multiple.multiple;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.util.Vector;

import java.util.Collection;

public final class Multiple extends JavaPlugin implements Listener {
    private static Multiple plugin;
    @Override
    public void onEnable() {
        plugin = this;
        getLogger().info("플러그인 활성화");
        getServer().getPluginManager().registerEvents(this, this);
        for (Player player : getServer().getOnlinePlayers()) {
            increaseAttacker(player);
        }
    }
    @EventHandler
    public void onPLayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        increaseAttacker(player);
    }
    @Override
    public void onDisable() {
        getLogger().info("플러그인 비활성화");
    }
    private void increaseAttacker(Player player) {
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE);
        if (attributeInstance != null) {
            attributeInstance.setBaseValue(attributeInstance.getBaseValue() * 100);
        }
    }
    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        event.setDamage(event.getDamage() * 100);
    }
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        ItemStack itemStack = null;
        Block block = event.getBlock();
        Player player = event.getPlayer();
        ItemStack tool = player.getInventory().getItemInMainHand();
        if (tool.getType().getMaxDurability() > 0 && event.getBlock().getType() != Material.AIR) {
            short durability = tool.getDurability();
            tool.setDurability((short) (durability + 1));
        }
        if (block.getType().equals(Material.BLACK_BED)) {
            itemStack = new ItemStack(Material.BLACK_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.BLUE_BED)) {
            itemStack = new ItemStack(Material.BLUE_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.BROWN_BED)) {
            itemStack = new ItemStack(Material.BROWN_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.GREEN_BED)) {
            itemStack = new ItemStack(Material.GREEN_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.CYAN_BED)) {
            itemStack = new ItemStack(Material.CYAN_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.LIGHT_BLUE_BED)) {
            itemStack = new ItemStack(Material.LIGHT_BLUE_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.GRAY_BED)) {
            itemStack = new ItemStack(Material.GRAY_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.LIGHT_GRAY_BED)) {
            itemStack = new ItemStack(Material.LIGHT_GRAY_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.LIME_BED)) {
            itemStack = new ItemStack(Material.LIME_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.MAGENTA_BED)) {
            itemStack = new ItemStack(Material.MAGENTA_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.ORANGE_BED)) {
            itemStack = new ItemStack(Material.ORANGE_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 10배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.PINK_BED)) {
            itemStack = new ItemStack(Material.PINK_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.PURPLE_BED)) {
            itemStack = new ItemStack(Material.PURPLE_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.RED_BED)) {
            itemStack = new ItemStack(Material.RED_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.YELLOW_BED)) {
            itemStack = new ItemStack(Material.YELLOW_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.WHITE_BED)) {
            itemStack = new ItemStack(Material.WHITE_BED, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.DARK_OAK_DOOR)) {
            itemStack = new ItemStack(Material.DARK_OAK_DOOR, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.ACACIA_DOOR)) {
            itemStack = new ItemStack(Material.ACACIA_DOOR, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.BIRCH_DOOR)) {
            itemStack = new ItemStack(Material.BIRCH_DOOR, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.IRON_DOOR)) {
            itemStack = new ItemStack(Material.IRON_DOOR, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.JUNGLE_DOOR)) {
            itemStack = new ItemStack(Material.JUNGLE_DOOR, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.CRIMSON_DOOR)) {
            itemStack = new ItemStack(Material.CRIMSON_DOOR, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.MANGROVE_DOOR)) {
            itemStack = new ItemStack(Material.MANGROVE_DOOR, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.OAK_DOOR)) {
            itemStack = new ItemStack(Material.OAK_DOOR, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.WARPED_DOOR)) {
            itemStack = new ItemStack(Material.WARPED_DOOR, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.SPRUCE_DOOR)) {
            itemStack = new ItemStack(Material.SPRUCE_DOOR, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블럭으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.BLACK_BANNER)) {
            itemStack = new ItemStack(Material.BLACK_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.BLUE_BANNER)) {
            itemStack = new ItemStack(Material.BLUE_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.BROWN_BANNER)) {
            itemStack = new ItemStack(Material.BROWN_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.CYAN_BANNER)) {
            itemStack = new ItemStack(Material.CYAN_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.GRAY_BANNER)) {
            itemStack = new ItemStack(Material.GRAY_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.GREEN_BANNER)) {
            itemStack = new ItemStack(Material.GREEN_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.LIGHT_BLUE_BANNER)) {
            itemStack = new ItemStack(Material.LIGHT_BLUE_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.LIGHT_GRAY_BANNER)) {
            itemStack = new ItemStack(Material.LIGHT_GRAY_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.LIME_BANNER)) {
            itemStack = new ItemStack(Material.LIME_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.MAGENTA_BANNER)) {
            itemStack = new ItemStack(Material.MAGENTA_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.ORANGE_BANNER)) {
            itemStack = new ItemStack(Material.ORANGE_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.PINK_BANNER)) {
            itemStack = new ItemStack(Material.PINK_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.PURPLE_BANNER)) {
            itemStack = new ItemStack(Material.PURPLE_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.RED_BANNER)) {
            itemStack = new ItemStack(Material.RED_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.WHITE_BANNER)) {
            itemStack = new ItemStack(Material.WHITE_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.YELLOW_BANNER)) {
            itemStack = new ItemStack(Material.YELLOW_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        }else if (block.getType().equals(Material.BLACK_WALL_BANNER)) {
            itemStack = new ItemStack(Material.BLACK_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.BLUE_WALL_BANNER)) {
            itemStack = new ItemStack(Material.BLUE_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.BROWN_WALL_BANNER)) {
            itemStack = new ItemStack(Material.BROWN_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.CYAN_WALL_BANNER)) {
            itemStack = new ItemStack(Material.CYAN_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.GRAY_WALL_BANNER)) {
            itemStack = new ItemStack(Material.GRAY_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.GREEN_WALL_BANNER)) {
            itemStack = new ItemStack(Material.GREEN_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.LIGHT_BLUE_WALL_BANNER)) {
            itemStack = new ItemStack(Material.LIGHT_BLUE_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.LIGHT_GRAY_WALL_BANNER)) {
            itemStack = new ItemStack(Material.LIGHT_GRAY_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.LIME_WALL_BANNER)) {
            itemStack = new ItemStack(Material.LIME_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.MAGENTA_WALL_BANNER)) {
            itemStack = new ItemStack(Material.MAGENTA_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.ORANGE_WALL_BANNER)) {
            itemStack = new ItemStack(Material.ORANGE_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.PINK_WALL_BANNER)) {
            itemStack = new ItemStack(Material.PINK_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.PURPLE_WALL_BANNER)) {
            itemStack = new ItemStack(Material.PURPLE_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.RED_WALL_BANNER)) {
            itemStack = new ItemStack(Material.RED_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.WHITE_WALL_BANNER)) {
            itemStack = new ItemStack(Material.WHITE_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.YELLOW_WALL_BANNER)) {
            itemStack = new ItemStack(Material.YELLOW_BANNER, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.CREEPER_BANNER_PATTERN)) {
            itemStack = new ItemStack(Material.CREEPER_BANNER_PATTERN, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.FLOWER_BANNER_PATTERN)) {
            itemStack = new ItemStack(Material.FLOWER_BANNER_PATTERN, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.GLOBE_BANNER_PATTERN)) {
            itemStack = new ItemStack(Material.GLOBE_BANNER_PATTERN, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.MOJANG_BANNER_PATTERN)) {
            itemStack = new ItemStack(Material.MOJANG_BANNER_PATTERN, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.PIGLIN_BANNER_PATTERN)) {
            itemStack = new ItemStack(Material.PIGLIN_BANNER_PATTERN, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        } else if (block.getType().equals(Material.SKULL_BANNER_PATTERN)) {
            itemStack = new ItemStack(Material.SKULL_BANNER_PATTERN, 1);
            event.setExpToDrop(event.getExpToDrop() * 100);
            block.setType(Material.AIR); // 블록을 공기 블록으로 변경
            event.setCancelled(true); // 블록 부수기를 취소
            event.setCancelled(true); // 기본 드롭을 막음
            itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack);
        }
        if (block.getType() == Material.GOLD_ORE) {
            if (tool.getType() == Material.IRON_PICKAXE || tool.getType() == Material.DIAMOND_PICKAXE || tool.getType() == Material.NETHERITE_PICKAXE) {
                if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
                    int gold = 1 + (int) (Math.random() * 2);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GOLD_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
                    int gold = 1 + (int) (Math.random() * 3);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GOLD_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
                    int gold = 1 + (int) (Math.random() * 4);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GOLD_INGOT, gold)); // 드랍 아이템 추가
                } else {
                    itemStack = new ItemStack(Material.GOLD_INGOT, 1);
                }
            } else {
                event.setCancelled(true);
                block.setType(Material.AIR);
                return;
            }
        } else if (block.getType() == Material.DEEPSLATE_GOLD_ORE) {
            if (tool.getType() == Material.IRON_PICKAXE || tool.getType() == Material.DIAMOND_PICKAXE || tool.getType() == Material.NETHERITE_PICKAXE) {
                if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
                    int gold = 1 + (int) (Math.random() * 2);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GOLD_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
                    int gold = 1 + (int) (Math.random() * 3);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GOLD_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
                    int gold = 1 + (int) (Math.random() * 4);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GOLD_INGOT, gold)); // 드랍 아이템 추가
                } else {
                    itemStack = new ItemStack(Material.GOLD_INGOT, 1);
                }
            } else {
                event.setCancelled(true);
                block.setType(Material.AIR);
                return;
            }
        } else if (block.getType() == Material.DEEPSLATE_IRON_ORE) {
            if (tool.getType() == Material.STONE_PICKAXE || tool.getType() == Material.IRON_PICKAXE || tool.getType() == Material.DIAMOND_PICKAXE || tool.getType() == Material.NETHERITE_PICKAXE) {
                if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
                    int gold = 1 + (int) (Math.random() * 2);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.IRON_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
                    int gold = 1 + (int) (Math.random() * 3);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.IRON_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
                    int gold = 1 + (int) (Math.random() * 4);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.IRON_INGOT, gold)); // 드랍 아이템 추가
                } else {
                    itemStack = new ItemStack(Material.IRON_INGOT, 1);
                }
            } else {
                event.setCancelled(true);
                block.setType(Material.AIR);
                return;
            }
        } else if (block.getType() == Material.IRON_ORE) {
            if (tool.getType() == Material.STONE_PICKAXE || tool.getType() == Material.IRON_PICKAXE || tool.getType() == Material.DIAMOND_PICKAXE || tool.getType() == Material.NETHERITE_PICKAXE) {
                if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
                    int gold = 1 + (int) (Math.random() * 2);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.IRON_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
                    int gold = 1 + (int) (Math.random() * 3);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.IRON_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
                    int gold = 1 + (int) (Math.random() * 4);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.IRON_INGOT, gold)); // 드랍 아이템 추가
                } else {
                    itemStack = new ItemStack(Material.IRON_INGOT, 1);
                }
            } else {
                event.setCancelled(true);
                block.setType(Material.AIR);
                return;
            }
        } else if (block.getType() == Material.DEEPSLATE_COPPER_ORE) {
            if (tool.getType() == Material.STONE_PICKAXE || tool.getType() == Material.IRON_PICKAXE || tool.getType() == Material.DIAMOND_PICKAXE || tool.getType() == Material.NETHERITE_PICKAXE) {
                if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
                    int gold = 1 + (int) (Math.random() * 2);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.COPPER_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
                    int gold = 1 + (int) (Math.random() * 3);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.COPPER_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
                    int gold = 1 + (int) (Math.random() * 4);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.COPPER_INGOT, gold)); // 드랍 아이템 추가
                } else {
                    itemStack = new ItemStack(Material.COPPER_INGOT, 1);
                }
            } else {
                event.setCancelled(true);
                block.setType(Material.AIR);
                return;
            }
        } else if (block.getType() == Material.COPPER_ORE) {
            if (tool.getType() == Material.STONE_PICKAXE || tool.getType() == Material.IRON_PICKAXE || tool.getType() == Material.DIAMOND_PICKAXE || tool.getType() == Material.NETHERITE_PICKAXE) {
                if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
                    int gold = 1 + (int) (Math.random() * 2);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.COPPER_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
                    int gold = 1 + (int) (Math.random() * 3);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.COPPER_INGOT, gold)); // 드랍 아이템 추가
                } else if (tool.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && tool.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 3) {
                    int gold = 1 + (int) (Math.random() * 4);
                    event.setCancelled(true); // 이벤트 취소
                    block.setType(Material.AIR); // 블록 삭제
                    player.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.COPPER_INGOT, gold)); // 드랍 아이템 추가
                } else {
                    itemStack = new ItemStack(Material.COPPER_INGOT, 1);
                }
            } else {
                event.setCancelled(true);
                block.setType(Material.AIR);
                return;
            }
        } else if (block.getType() == Material.AZALEA_LEAVES) {
            itemStack = new ItemStack(Material.GOLDEN_APPLE, 1);
            int random = 1 + (int) (Math.random() * 20);
            if (random == 10) {
                block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            }
        } else if (block.getType() == Material.FLOWERING_AZALEA_LEAVES) {
            itemStack = new ItemStack(Material.GOLDEN_APPLE, 1);
            int random = 1 + (int) (Math.random() * 20);
            if (random == 10) {
                block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            }
        } else if (block.getType() == Material.JUNGLE_LEAVES) {
            itemStack = new ItemStack(Material.GOLDEN_APPLE, 1);
            int random = 1 + (int) (Math.random() * 20);
            if (random == 10) {
                block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            }
        } else if (block.getType() == Material.BIRCH_LEAVES) {
            itemStack = new ItemStack(Material.GOLDEN_APPLE, 1);
            int random = 1 + (int) (Math.random() * 20);
            if (random == 10) {
                block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            }
        } else if (block.getType() == Material.SPRUCE_LEAVES) {
            itemStack = new ItemStack(Material.GOLDEN_APPLE, 1);
            int random = 1 + (int) (Math.random() * 20);
            if (random == 10) {
                block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            }
        } else if (block.getType() == Material.MANGROVE_LEAVES) {
            itemStack = new ItemStack(Material.GOLDEN_APPLE, 1);
            int random = 1 + (int) (Math.random() * 20);
            if (random == 10) {
                block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            }
        } else if (block.getType() == Material.DARK_OAK_LEAVES) {
            itemStack = new ItemStack(Material.GOLDEN_APPLE, 1);
            int random = 1 + (int) (Math.random() * 20);
            if (random == 10) {
                block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            }
        } else if (block.getType() == Material.ACACIA_LEAVES) {
            itemStack = new ItemStack(Material.GOLDEN_APPLE, 1);
            int random = 1 + (int) (Math.random() * 20);
            if (random == 10) {
                block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            }
        } else if (block.getType() == Material.OAK_LEAVES) {
            itemStack = new ItemStack(Material.GOLDEN_APPLE, 1);
            int random = 1 + (int) (Math.random() * 20);
            if (random == 10) {
                block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            }
        } else {
            Collection<ItemStack> drops = block.getDrops(event.getPlayer().getInventory().getItemInMainHand());
            if (!drops.isEmpty()) {
                itemStack = drops.iterator().next(); // 블록이 드롭하는 아이템 스택
            } else {
                return;
            }
        }
        event.setExpToDrop(event.getExpToDrop() * 100);
        block.setType(Material.AIR); // 블록을 공기 블록으로 변경
        event.setCancelled(true); // 블록 부수기를 취소
        event.setCancelled(true); // 기본 드롭을 막음
        assert itemStack != null;
        itemStack.setAmount(itemStack.getAmount() * 100); // 아이템 스택의 수량을 100배로 조정
        event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), itemStack); // 100배로 조정한 아이템 스택을 드롭
    }
    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        if (event.getEntityType() == EntityType.PLAYER) {
            return;
        }
        for(ItemStack item : event.getDrops()) {
            item.setAmount(item.getAmount() * 100);
        }
        event.setDroppedExp(event.getDroppedExp() * 100);
    }

    @EventHandler
    public void onExplosion(ExplosionPrimeEvent event) {
        event.setRadius(event.getRadius() * 10);
    }
    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent event) {
        Projectile projectile = event.getEntity();
        if (projectile.getShooter() instanceof Entity) {
            Entity shooter = (Entity) projectile.getShooter();
            Location location = shooter.getLocation().add(0, 1, 0);
            if (projectile.getType() == EntityType.ARROW || projectile.getType() == EntityType.SNOWBALL || projectile.getType() == EntityType.TRIDENT || projectile.getType() == EntityType.ENDER_PEARL || projectile.getType() == EntityType.FIREBALL || projectile.getType() == EntityType.SMALL_FIREBALL) {
                double spread = 0.7;
                Vector originalVelocity = projectile.getVelocity();
                for (int i = 0; i < 99; i++) {
                    Vector spreadVelocity = originalVelocity.clone().add(new Vector(Math.random() * spread - spread / 2, Math.random() * spread - spread / 2, Math.random() * spread - spread / 2));
                    Projectile newProjectile = (Projectile) shooter.getWorld().spawnEntity(location, projectile.getType());
                    newProjectile.setShooter((ProjectileSource) shooter);
                    newProjectile.setVelocity(spreadVelocity);
                    newProjectile.setMetadata("projectile", new FixedMetadataValue(plugin, true));
                }
            }
        }
    }
    @EventHandler
    public void onPlayerPickupItem(PlayerPickupItemEvent event) {
        if (event.getItem().hasMetadata("projectile")) { // 해당 아이템이 발사체인지 체크
            event.setCancelled(true); // 이벤트 취소
        }
    }
}