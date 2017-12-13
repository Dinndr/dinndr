package dinndr;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DishPopulator implements CommandLineRunner {

	@Resource
	public DishRepo dishRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Dish bonelessChicken = new Dish("Boneless Chicken","Boneless chicken pieces marinated in yogurt, fresh spices, and lemon juice, grilled on skewers in tandoor.","Tandoori Grill","$10.00","/images/tg-tandoorplatter.jpg","Chicken","Rice","Desi","Savory","Platter");
		bonelessChicken = dishRepo.save(bonelessChicken);
		Dish goatQormaCurry = new Dish("Goat Qorma Curry","Marinated succulent meat cooked with fried onion, delicately flavored with saffron and simmered in a blend of yogurt and house spices. korma is a braising technique where the meat is first cooked briskly using high heat and then subjected to long, slow cooking using moist eat and minimum of added liquid","Tandoori Grill","$14.00","/images/tg-goatchops.jpg","Goat","Savory","Spicy","Desi","Platter");
		goatQormaCurry = dishRepo.save(goatQormaCurry);
		Dish chanaMasala = new Dish("Chana Masala","Chick peas delicately cooked with a hint of garlic, ginger, and onion. Seasoned with tamarind, house spices, and cilantro leaves.","Tandoori Grill","$7.00","/images/tg-chana-masala.jpg","Vegetarian","Desi","Beans","Chickpeas","Spicy");
		chanaMasala = dishRepo.save(chanaMasala);
		Dish chickenKathiRoll = new Dish("Chicken Kathi Roll","Boneless chicken pieces marinated in tandoori sauce and grilled in tandoor.","Tandoori Grill","$6.00","/images/tg-kebab-wrap.jpg","Chicken","Sandwich","Wrap","Desi","Savory");
		chickenKathiRoll = dishRepo.save(chickenKathiRoll);
		Dish rasMalai = new Dish("Ras Malai","Traditional delicacy, made with special cottage cheese, soaked in richly flavored sweet milk with a hint of saffron, almonds, pistachios, and cardamom, served chilled.","Tandoori Grill","$2.00","/images/tg-ras-malai.jpg","Sweet","Dessert","Desi","Dairy","Creamy");
		rasMalai = dishRepo.save(rasMalai);
		Dish blueCheesePotatoChips = new Dish("Blue Cheese Potato Chips","a Cap City original, blue cheese, chives and Alfredo sauce","Cap City","$9.99","/images/cc-chips.jpg","Small-plate","Vegetarian","Cheese","Savory","Potatoes");
		blueCheesePotatoChips = dishRepo.save(blueCheesePotatoChips);
		Dish capCityDinerMeatloaf = new Dish("Cap City Diner Meatloaf","buttermilk-chive mashed potatoes, wild mushrooms, broccoli, chili onion rings and BBQ gravy","Cap City","$17.79","/images/cc-meatloaf.jpg","Beef","Savory","Potatoes","Savory","Mushrooms");
		capCityDinerMeatloaf = dishRepo.save(capCityDinerMeatloaf);
		Dish pecanCrustedPorkChops = new Dish("Pecan Crusted Pork Chops","cheddar-chipotle mashed potatoes, candied pecans, spinach, shallots, and an apple cider glaze","Cap City","$21.99","/images/cc-porkchops.jpg","Pork","Pecans","Savory","Potatoes","Spinach");
		pecanCrustedPorkChops = dishRepo.save(pecanCrustedPorkChops);
		Dish romanoCrustedChicken = new Dish("Romano Crusted Chicken","crispy fried chicken, garlic buttered noodles, roasted tomato cream sauce","Cap City","$17.99","/images/cc-chicken.jpg","Dinner","Chicken","Pasta","Tomato","Creamy");
		romanoCrustedChicken = dishRepo.save(romanoCrustedChicken);
		Dish seriouslyBigChocolateCake = new Dish("Seriously Big Chocolate Cake","our famous three-layer cake","Cap City","$7.99","/images/cc-chocolatecake.jpg","Dessert","Sweet","Chocolate","Cake","Giant");
		seriouslyBigChocolateCake = dishRepo.save(seriouslyBigChocolateCake);
		Dish halfSlabSmokedStLouisCutSpareRibs = new Dish("Half Slab Smoked St Louis Cut Spare Ribs","Smoked spare ribs covered in your choice of Ray Ray's sauces or rubs: Ray Ray's Sweet BBQ, Jalapeno BBQ, Habanero BBQ, Vinegar Base Sauce, Ray Ray's Dry Rub, or Spicy Dry Rub.","Ray Ray's","$11.00","/images/ray-half-slab-smoked-st-louis-cut-spare-ribs.jpg","Dinner","Savory","American","BBQ","Pork");
		halfSlabSmokedStLouisCutSpareRibs = dishRepo.save(halfSlabSmokedStLouisCutSpareRibs);
		Dish jerkChicken = new Dish("Jerk Chicken","Boneless smoked chicken thighs cooked in jerk sauce and topped with pickled red cabbage and red onion.","Ray Ray's","$7.00","/images/ray-jerk-chicken.jpg","Dinner","Savory","Sandwich","Chicken","BBQ");
		jerkChicken = dishRepo.save(jerkChicken);
		Dish beefBrisket = new Dish("Beef Brisket","Served with your choice of sauce on top or on the side. Ray Ray's sauces: Ray Ray's Sweet BBQ, Jalapeno BBQ, Habanero BBQ, and Vinegar Base Sauce ","Ray Ray's","$8.00","/images/ray-beef-brisket.jpg","Dinner","Savory","Sandwich","Beef","BBQ");
		beefBrisket = dishRepo.save(beefBrisket);
		Dish scratchMacNCheese = new Dish("Scratch Mac-N-Cheese","Noodles cooked to perfection and surounded by delicious cheesey goodness.","Ray Ray's","$4.00","/images/ray-scratch-mac-n-cheese.jpg","Side","Savory","American","Vegetarian","Pasta");
		scratchMacNCheese = dishRepo.save(scratchMacNCheese);
		Dish bananaPudding = new Dish("Banana Puddin'","This classic dessert is served exclusivley at Ray Ray's Clintonville location.","Ray Ray's","$3.00","/images/ray-banana-pudding.jpg","Dessert","Sweet","American","Vegetarian","Banana");
		bananaPudding = dishRepo.save(bananaPudding);
		Dish spicyYumaPizza = new Dish("Spicy Yuma Pizza","gouda/havarti blend, chorizo, jalepenos, corn, roasted red peppers and chipotle spiked tomato sauce.","Harvest Pizzeria","$15.75","images/harvest1.jpg","Pizza","Spicy","Tasty","Yum","Wood Fired");
		spicyYumaPizza = dishRepo.save(spicyYumaPizza);
		Dish pimentoCheese = new Dish("Pimento Cheese","with sour dough , bread and butter pickles","Harvest Pizzeria","$7.00","images/harvest2.jpg","Cheese","Dip","Small Plate","Creamy","Appetizer");
		pimentoCheese = dishRepo.save(pimentoCheese);
		Dish margheritaPizza = new Dish("Margherita Pizza","Fresh Mozarella, Basil","Harvest Pizzeria","$12.75","images/harvest3.jpg","Pizza","Vegetarian","Wood Fired","Italian","Basil");
		margheritaPizza = dishRepo.save(margheritaPizza);
		Dish meanGreenSalad = new Dish("Mean Green Salad","Spinach, arugula, black beluga lentils, avacado green goddess dressing","Harvest Pizzeria","$6.00","images/harvest4.jpg","Salad","Vegetarian","Healthy","Greens","Greens");
		meanGreenSalad = dishRepo.save(meanGreenSalad);
		Dish buckeyeBrownie = new Dish("Buckeye Brownie","Chocolate, Krema Peanut Butter, Vanilla Bean Ice Cream","Harvest Pizzeria","$7.00","images/harvest5.jpg","Dessert","Gluten Free","Sweet","Chocolate","Organic");
		buckeyeBrownie = dishRepo.save(buckeyeBrownie);
		Dish germanRoastPorkLoin = new Dish("German Roast Pork Loin","Tender roast pork loin served with redskin mashed potatoes and your choice of cranberry-apple compote or a rich demi glaze.","Mozart's","$14.95","images/mozarts1.jpg","Diner","Pork","Meat","Demi Glaze","Mashed Potatoes");
		germanRoastPorkLoin = dishRepo.save(germanRoastPorkLoin);
		Dish hamGorgonzolaSpatzle = new Dish("Ham & Gorgonzola Spatzle","House made spatzle and smokey Black Forest ham simmered in a creamy gorgonzola sauce.","Mozart's","$12.95","images/mozarts2.jpg","Diner","Spatzle","Smoked Ham","Gorganzola","Meat");
		hamGorgonzolaSpatzle = dishRepo.save(hamGorgonzolaSpatzle);
		Dish beefStroganoff = new Dish("Beef Stroganoff","Braised beef and portabella in a Marsala wine demi glace, topped with a dollop of sour cream and served with buttered spatzle.","Mozart's","$15.95","images/mozarts3.jpg","Diner","Meat","Stroganoff","Marsala","Spatzle");
		beefStroganoff = dishRepo.save(beefStroganoff);
		Dish wienerSchnitzel = new Dish("Wiener Schnitzel","A lightly breaded, golden brown cutlet prepared in the traditional Viennese style. Served with house made buttered spatzle or redskin mashed potatoes along with your choice of ratatouille, fresh market vegetables, or a side salad.","Mozart's","$15.95","images/mozarts4.jpg","Diner","Meat","Veal","Ratatouille","Spatzle");
		wienerSchnitzel = dishRepo.save(wienerSchnitzel);
		Dish chocolateGanacheTorte = new Dish("Chocolate Ganache Torte","Three layers of moist chocolate cake filled with chocolate buttercream and enrobed in a rich chocolate ganache.","Mozart's","$12.00","images/mozarts5.jpg","Dessert","Chocolate","Ganache","Tort","Buttercream");
		chocolateGanacheTorte = dishRepo.save(chocolateGanacheTorte);
		Dish quinoaTabouliSalad = new Dish("Quinoa Tabouli Salad","Quinioa, kale, cherry tomatoes, parslet and red onion in a lemon vinagrette with a tahini dressing drizzle","Acre","$7.95","images/acre1.jpg","Salad","Quinioa","Kale","Cherry Tomatoes","Organic");
		quinoaTabouliSalad = dishRepo.save(quinoaTabouliSalad);
		Dish moleBowl = new Dish("Mole Bowl","Roasted mushrooms, peppers and onions in a savory Mexican pepper sauce topped with a drizzle of avocado sour cream and pepitas over brown rice or substiture quinoa(add 1.50)","Acre","$9.85","images/acre2.jpg","Bowl","Mushrooms","Peppers","Onions","");
		moleBowl = dishRepo.save(moleBowl);
		Dish bbqRanchWrap = new Dish("BBQ Ranch Wrap","Roasted sweet potatoes, peppers and onions topped with bbq sauve, shredded cabbage and a drizzle of ranch over brown rice or quinoa (add 1.50)","Acre","$9.45","images/acre3.jpg","Wrap","Sweet Potatoes","Peppers","Cabbage","Organic");
		bbqRanchWrap = dishRepo.save(bbqRanchWrap);
		Dish srirachaChickenSaladSandwich = new Dish("Sriracha Chicken Salad Sandwich","Spicy chicken salad with house pickes and shredded carrots on local ciabatta bread","Acre","$9.25","images/acre4.jpg","Sandwich","Chicken","Pickles","Carrots","Organic");
		srirachaChickenSaladSandwich = dishRepo.save(srirachaChickenSaladSandwich);
		Dish bbqPorkSandwich = new Dish("BBQ Pork Sandwich","Cider braised pork and house made bbq sauve topped with mango slaw on ciabatta bread","Acre","$9.45","images/acre5.jpg","Sandwich","Pork","Mango","Organic","BBQ");
		bbqPorkSandwich = dishRepo.save(bbqPorkSandwich);
		Dish grilledSirloinSteakBurroGrande = new Dish("Grilled Sirloin Steak Burro Grande","Large burrito filled with Mexican rice, refried beans, cheese sauce on top, served with lettuce, sour cream, pico de gallo, and guacamole on the side","El Vaquero","$11.85","/images/ev-burrito-grande.jpg","Dinner","Lunch","Steak","Mexican","Meat");
		grilledSirloinSteakBurroGrande = dishRepo.save(grilledSirloinSteakBurroGrande);
		Dish enchiladasVegetales = new Dish("Enchiladas Vegetales","Three cheese enchiladas topped with grilled onions, bell peppers, zucchinis, covered with ranchero sauce. Served with black beans or refried beans, lettuce, tomato and cheese.","El Vaquero","$11.75","/images/ev-enchilades-vegetales.jpg","Vegetarian","Lunch","Grilled","Mexican","Cheese");
		enchiladasVegetales = dishRepo.save(enchiladasVegetales);
		Dish polloMargarita = new Dish("Pollo Margarita","Grilled marinated chicken breast, cooked with black bean corn salsa, in tortilla strips, served with melted Monterrey jack cheddar cheese. Evaporated with El Vaquero original margarita, served with rice, beans and tortillas.","El Vaquero","$12.99","/images/ev-pollo-margarita.jpg","Dinner","Lunch","Chicken","Mexican","Meat");
		polloMargarita = dishRepo.save(polloMargarita);
		Dish elManjarVaquero = new Dish("El Manjar Vaquero","One Chicken enchilada, grilled marinated chicken breast, sirloin steak. Served with Mexican rice, black beans and tortillas.","El Vaquero","$15.75","/images/ev-el-manjar-vaquero.jpg","Dinner","Chicken","Rice","Mexican","Meat");
		elManjarVaquero = dishRepo.save(elManjarVaquero);
		Dish tacosDePescado = new Dish("Tacos de Pescado","Fish tacos, broccoli cole slaw, chipotle sauce and lime","El Vaquero","$9.99","/images/ev-tacos-de-pescado.jpg","Dinner","Lunch","Broccoli","Mexican","Fish");
		tacosDePescado = dishRepo.save(tacosDePescado);
		

	}

}
