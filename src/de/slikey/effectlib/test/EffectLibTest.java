package de.slikey.effectlib.test;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import de.slikey.effectlib.EffectLib;
import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.test.command.*;

public class EffectLibTest extends JavaPlugin implements Listener {
	private EffectManager effectManager;

	@Override
	public void onEnable() {
		EffectLib lib = EffectLib.instance();
		effectManager = new EffectManager(lib);
		loadCommands();
	}

	@Override
	public void onDisable() {
		effectManager.dispose();
	}

	private void loadCommands() {
		getCommand("arc").setExecutor(new ArcCommand(effectManager));
		getCommand("atom").setExecutor(new AtomCommand(effectManager));
		getCommand("bigbang").setExecutor(new BigBangCommand(effectManager));
		getCommand("bleed").setExecutor(new BleedCommand(effectManager));
		getCommand("cone").setExecutor(new ConeCommand(effectManager));
		getCommand("cube").setExecutor(new CubeCommand(effectManager));
		getCommand("dna").setExecutor(new DnaCommand(effectManager));
		getCommand("donut").setExecutor(new DonutCommand(effectManager));
		getCommand("explode").setExecutor(new ExplodeCommand(effectManager));
		getCommand("flame").setExecutor(new FlameCommand(effectManager));
		getCommand("fountain").setExecutor(new FountainCommand(effectManager));
		getCommand("grid").setExecutor(new GridCommand(effectManager));
		getCommand("helix").setExecutor(new HelixCommand(effectManager));
		getCommand("hill").setExecutor(new HillCommand(effectManager));
		getCommand("image").setExecutor(new ImageCommand(this, effectManager));
		getCommand("jump").setExecutor(new JumpCommand(effectManager));
		getCommand("line").setExecutor(new LineCommand(effectManager));
		getCommand("music").setExecutor(new MusicCommand(effectManager));
		getCommand("musicloc").setExecutor(new MusicLocCommand(effectManager));
		getCommand("shield").setExecutor(new ShieldCommand(effectManager));
		getCommand("skyrocket").setExecutor(new SkyrocketCommand(effectManager));
		getCommand("smoke").setExecutor(new SmokeCommand(effectManager));
		getCommand("star").setExecutor(new StarCommand(effectManager));
		getCommand("text").setExecutor(new TextCommand(effectManager));
		getCommand("trace").setExecutor(new TraceCommand(effectManager));
		getCommand("turn").setExecutor(new TurnCommand(effectManager));
		getCommand("vortex").setExecutor(new VortexCommand(effectManager));
		getCommand("warp").setExecutor(new WarpCommand(effectManager));
	}

}
