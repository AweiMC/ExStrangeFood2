package team.teampotato.exstrangefood2;

import net.fabricmc.api.ModInitializer;
import team.teampotato.exstrangefood2.ArmorMaterials.ArmorMaterials;
import team.teampotato.exstrangefood2.ToolMaterial.ToolClassAxe;
import team.teampotato.exstrangefood2.ToolMaterial.ToolClassPickaxe;
import team.teampotato.exstrangefood2.ToolMaterial.ToolClassShovel;
import team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class exstrangefood implements ModInitializer {
		public static final ItemGroup exstrangefoods = FabricItemGroupBuilder.create(
						new Identifier("exstrangefood", "exstrangefood"))
				.icon(() -> new ItemStack(exstrangefood.goldsteak))
				.appendItems(stacks -> {
					stacks.add(new ItemStack(exstrangefood.dragon060810));
					stacks.add(new ItemStack(exstrangefood.goldsteak));
					stacks.add(new ItemStack(exstrangefood.goldcooked_rabbit));
					stacks.add(new ItemStack(exstrangefood.goldbeetroot_soup));
					stacks.add(new ItemStack(exstrangefood.goldcooked_porkchop));
					stacks.add(new ItemStack(exstrangefood.goldcooked_mutton));
					stacks.add(new ItemStack(exstrangefood.goldbucket_of_axolotl));
					stacks.add(new ItemStack(exstrangefood.goldmilk_bucket));
					stacks.add(new ItemStack(exstrangefood.goldbread));
					stacks.add(new ItemStack(exstrangefood.goldpotato));
					stacks.add(new ItemStack(exstrangefood.ironpotato));
					stacks.add(new ItemStack(exstrangefood.iron_milk_bucket));
					stacks.add(new ItemStack(exstrangefood.ironbread));
					stacks.add(new ItemStack(exstrangefood.iron_bucket_of_axolotl));
					stacks.add(new ItemStack(exstrangefood.ironsteak));
					stacks.add(new ItemStack(exstrangefood.ironcooked_porkchop));
					stacks.add(new ItemStack(exstrangefood.ironbeetroot_soup));
					stacks.add(new ItemStack(exstrangefood.ironcooked_rabbit));
					stacks.add(new ItemStack(exstrangefood.ironcooked_mutton));
					stacks.add(new ItemStack(exstrangefood.copper_and_iron));
					stacks.add(new ItemStack(exstrangefood.copper_bucket_of_axolotl));
					stacks.add(new ItemStack(exstrangefood.copperbeetroot_soup));
					stacks.add(new ItemStack(exstrangefood.copperbread));
					stacks.add(new ItemStack(exstrangefood.coppercooked_mutton));
					stacks.add(new ItemStack(exstrangefood.coppercooked_porkchop));
					stacks.add(new ItemStack(exstrangefood.coppercooked_rabbit));
					stacks.add(new ItemStack(exstrangefood.coppermilk_bucket));
					stacks.add(new ItemStack(exstrangefood.copperpotato));
					stacks.add(new ItemStack(exstrangefood.coppersteak));
					stacks.add(new ItemStack(exstrangefood.apotato));
				})
				.build();
		//工具菜单
	public static final ItemGroup exstrangefoodtool = FabricItemGroupBuilder.create(
					new Identifier("exstrangefood", "exstrangefoodtool"))
			.icon(() -> new ItemStack(exstrangefood.exsfsyncretic))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(exstrangefood.nether_stick));
				stacks.add(new ItemStack(exstrangefood.nether_torch));
				stacks.add(new ItemStack(exstrangefood.syncretic_sword));
				stacks.add(new ItemStack(exstrangefood.syncretic_shovel));
				stacks.add(new ItemStack(exstrangefood.syncretic_axe));
				stacks.add(new ItemStack(exstrangefood.syncretic_pickaxe));
				stacks.add(new ItemStack(exstrangefood.exsfsyncretic));
				stacks.add(new ItemStack(exstrangefood.coarsenetherite));
				stacks.add(new ItemStack(exstrangefood.copper_helmet));
				stacks.add(new ItemStack(exstrangefood.copper_chestplate));
				stacks.add(new ItemStack(exstrangefood.copper_leggings));
				stacks.add(new ItemStack(exstrangefood.copper_boots));
				stacks.add(new ItemStack(exstrangefood.amethystshard_helmet));
				stacks.add(new ItemStack(exstrangefood.amethystshard_chestplate));
				stacks.add(new ItemStack(exstrangefood.amethystshard_leggings));
				stacks.add(new ItemStack(exstrangefood.amethystshard_boots));
				stacks.add(new ItemStack(exstrangefood.amethystshard_sword));
				stacks.add(new ItemStack(exstrangefood.amethystshard_shovel));
				stacks.add(new ItemStack(exstrangefood.amethystshard_axe));
				stacks.add(new ItemStack(exstrangefood.amethystshard_pickaxe));
				stacks.add(new ItemStack(exstrangefood.copper_axe));
				stacks.add(new ItemStack(exstrangefood.copper_pickaxe));
				stacks.add(new ItemStack(exstrangefood.copper_shovel));
				stacks.add(new ItemStack(exstrangefood.copper_sword));
				stacks.add(new ItemStack(exstrangefood.diamond_knife));
			})
			.build();
	public static final ItemGroup create = FabricItemGroupBuilder.create(
					new Identifier("createitem", "create"))
			.icon(() -> new ItemStack(Items.COMMAND_BLOCK))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Items.COMMAND_BLOCK));
				stacks.add(new ItemStack(Items.STRUCTURE_BLOCK));
				stacks.add(new ItemStack(Items.BARRIER));
				stacks.add(new ItemStack(exstrangefood.AweiSWORD));
			})
			.build();
	public static final Logger LOGGER = LoggerFactory.getLogger("exstrangefood2");
	//创建高级合金工具
	public static ToolItem syncretic_pickaxe = new ToolClassPickaxe(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.EXSFSYNCRETIC, 2, -1.0F, new Item.Settings());
	public static ToolItem syncretic_axe = new ToolClassAxe(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.EXSFSYNCRETIC, 3, -2.0F, new Item.Settings());
	public static ToolItem syncretic_sword = new SwordItem(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.EXSFSYNCRETIC, 5, -1.0F, new Item.Settings());
	public static ToolItem syncretic_shovel = new ToolClassShovel(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.EXSFSYNCRETIC, 2, -1.0F, new Item.Settings());
	//创建紫水晶工具-默认伤害6
	public static ToolItem amethystshard_pickaxe = new ToolClassPickaxe(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.amethystshard, 0, -2.8F, new Item.Settings());
	public static ToolItem amethystshard_axe = new ToolClassAxe(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.amethystshard, 5, -3.0F, new Item.Settings());
	public static ToolItem amethystshard_sword = new SwordItem(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.amethystshard, 2, -2.4F, new Item.Settings());
	public static ToolItem amethystshard_shovel = new ToolClassShovel(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.amethystshard, 0, -3.0F, new Item.Settings());
	//创建铜工具-默认7
	public static ToolItem copper_pickaxe = new ToolClassPickaxe(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.COPPER, 0, -2.8F, new Item.Settings());
	public static ToolItem copper_axe = new ToolClassAxe(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.COPPER, 5, -3.0F, new Item.Settings());
	public static ToolItem copper_sword = new SwordItem(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.COPPER, 2, -2.4F, new Item.Settings());
	public static ToolItem copper_shovel = new ToolClassShovel(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.COPPER, 0, -3.0F, new Item.Settings());
    //创建铜护甲
	public static final Item copper_helmet = new ArmorItem(ArmorMaterials.COPPER, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item copper_chestplate = new ArmorItem(ArmorMaterials.COPPER, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item copper_leggings = new ArmorItem(ArmorMaterials.COPPER, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item copper_boots = new ArmorItem(ArmorMaterials.COPPER, EquipmentSlot.FEET, (new Item.Settings()));
    //创建紫水晶护甲
	public static final Item amethystshard_helmet = new ArmorItem(ArmorMaterials.AMETHYSTSHARD, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item amethystshard_chestplate = new ArmorItem(ArmorMaterials.AMETHYSTSHARD, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item amethystshard_leggings = new ArmorItem(ArmorMaterials.AMETHYSTSHARD, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item amethystshard_boots = new ArmorItem(ArmorMaterials.AMETHYSTSHARD, EquipmentSlot.FEET, (new Item.Settings()));
	//创建钻石刀
	public static ToolItem diamond_knife = new SwordItem(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.DIAMONDKNIFE, 4, -2F, new Item.Settings());
	//AweiSWORD
	public static ToolItem AweiSWORD = new SwordItem(team.teampotato.exstrangefood2.ToolMaterial.ToolMaterials.AweiSWORD, 4, -2F, new Item.Settings());
	//一碗土豆
	public static final Item apotato = new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(1.5F)
					.build())
			.maxCount(64));
	//草莓龙果酱
	public static final Item dragon060810 = new Item(new Item.Settings()
				.food((new FoodComponent.Builder())
			.hunger(4)
					.saturationModifier(4.0F)
					.build())
			.maxCount(64));
	//镶金系列
	//金牛排
	public static final Item goldsteak = new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.6F)
					.build())
			.maxCount(24));
	//金兔肉
	public static final Item goldcooked_rabbit = new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(24));
	//金猪排
	public static final Item goldcooked_porkchop = new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(24));
	//金羊肉
	public static final Item goldcooked_mutton = new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(24));
	//金甜菜汤
	public static final Item goldbeetroot_soup = new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(24));
	//金美西螈桶
	public static final Item goldbucket_of_axolotl = new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(1.2F)
					.build())
			.maxCount(24));
	//金牛奶桶
	public static final Item goldmilk_bucket = new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(24));
	//金面包
	public static final Item goldbread= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(24));
	//金土豆 育碧233
	public static final Item goldpotato= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(24));
	//镶铁系列
	//铁土豆
	public static final Item ironpotato= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.4F)
					.build())
			.maxCount(16));
	//铁牛奶桶
	public static final Item iron_milk_bucket= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.6F)
					.build())
			.maxCount(16));
	//铁面包
	public static final Item ironbread= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//铁美西螈桶
	public static final Item iron_bucket_of_axolotl= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.9F)
					.build())
			.maxCount(16));
	//铁牛排
	public static final Item ironsteak= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//铁猪排
	public static final Item ironcooked_porkchop= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//铁甜菜汤
	public static final Item ironbeetroot_soup= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.4F)
					.build())
			.maxCount(16));
	//铁兔肉
	public static final Item ironcooked_rabbit= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.4F)
					.build())
			.maxCount(16));
	//铁羊肉
	public static final Item ironcooked_mutton= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.4F)
					.build())
			.maxCount(16));
	//镶铜系列
	//铜与铁
	public static final Item copper_and_iron= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.4F)
					.build())
			.maxCount(16));
	//铜美西螈桶
	public static final Item copper_bucket_of_axolotl= new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.4F)
					.build())
			.maxCount(16));
	//铜甜菜汤
	public static final Item copperbeetroot_soup=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
			.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//铜面包
	public static final Item copperbread=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//铜羊排
	public static final Item coppercooked_mutton=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//铜猪排
	public static final Item coppercooked_porkchop=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//铜兔肉
	public static final Item coppercooked_rabbit=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//铜牛奶桶
	public static final Item coppermilk_bucket=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//铜土豆
	public static final Item copperpotato=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//铜牛排
	public static final Item coppersteak=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.5F)
					.build())
			.maxCount(16));
	//高级合金锭
	public static final Item exsfsyncretic=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(2.5F)
					.build())
			.maxCount(64));
	//合金胚材料
	public static final Item coarsenetherite=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(1.0F)
					.build())
			.maxCount(64));
	//下界合金棍
	public static final Item nether_stick=new Item(new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.8F)
					.build())
			.maxCount(64));
	//下界火把
	public static ToolItem nether_torch = new SwordItem(ToolMaterials.GENG, -2, 96F, new Item.Settings()
			.food((new FoodComponent.Builder())
					.hunger(2)
					.saturationModifier(5F)
					.build())
			.maxCount(64));
	@Override
	public void onInitialize() {
		//注册奇怪的食物
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_goldsteak"), goldsteak);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_goldcooked_rabbit"), goldcooked_rabbit);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_dragon060810"), dragon060810);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_goldbeetroot_soup"), goldbeetroot_soup);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_goldcooked_porkchop"), goldcooked_porkchop);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_goldcooked_mutton"), goldcooked_mutton);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_goldbucket_of_axolotl"), goldbucket_of_axolotl);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_goldmilk_bucket"), goldmilk_bucket);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_goldbread"), goldbread);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_goldpotato"), goldpotato);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_ironpotato"), ironpotato);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_iron_milk_bucket"), iron_milk_bucket);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_ironbread"), ironbread);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_iron_bucket_of_axolotl"), iron_bucket_of_axolotl);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_ironsteak"), ironsteak);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_ironcooked_porkchop"), ironcooked_porkchop);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_ironbeetroot_soup"), ironbeetroot_soup);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_ironcooked_rabbit"), ironcooked_rabbit);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_ironcooked_mutton"), ironcooked_mutton);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_copper_and_iron"), copper_and_iron);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_copper_bucket_of_axolotl"), copper_bucket_of_axolotl);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_copperbread"), copperbread);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_copperbeetroot_soup"), copperbeetroot_soup);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_coppercooked_mutton"), coppercooked_mutton);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_coppercooked_porkchop"), coppercooked_porkchop);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_coppercooked_rabbit"), coppercooked_rabbit);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_coppermilk_bucket"), coppermilk_bucket);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_copperpotato"), copperpotato);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_coppersteak"), coppersteak);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_apotato"), apotato);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","food_nether_torch"), nether_torch);
		//注册工具一系列
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_syncretic_sword"), syncretic_sword);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","ingot_exsfsyncretic"), exsfsyncretic);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_syncretic_pickaxe"), syncretic_pickaxe);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_syncretic_axe"), syncretic_axe);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_syncretic_shovel"), syncretic_shovel);
		//注册工具材料
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","coarse_netherite"), coarsenetherite);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","stick_nether_stick"), nether_stick);
		//注册护甲
		//铜护甲
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","armor_copper_helmet"), copper_helmet);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","armor_copper_chestplate"), copper_chestplate);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","armor_copper_leggings"), copper_leggings);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","armor_copper_boots"), copper_boots);
		//紫水晶护甲
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","armor_amethystshard_helmet"), amethystshard_helmet);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","armor_amethystshard_chestplate"), amethystshard_chestplate);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","armor_amethystshard_leggings"), amethystshard_leggings);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","armor_amethystshard_boots"), amethystshard_boots);
		//紫水晶工具
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_amethystshard_pickaxe"), amethystshard_pickaxe);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_amethystshard_axe"), amethystshard_axe);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_amethystshard_sword"), amethystshard_sword);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_amethystshard_shovel"), amethystshard_shovel);
        //铜工具
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_copper_pickaxe"), copper_pickaxe);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_copper_axe"), copper_axe);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_copper_sword"), copper_sword);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_copper_shovel"), copper_shovel);
		//新武器
		//钻石刀
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_diamond_knife"), diamond_knife);
		Registry.register(Registry.ITEM, new Identifier("exstrangefood","tool_awei_sword"), AweiSWORD);
		LOGGER.info("Welcome to (EXSF)ExStrangeFoodMod2!");
	}
}
