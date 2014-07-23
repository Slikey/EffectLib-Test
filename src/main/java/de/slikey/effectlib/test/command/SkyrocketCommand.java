package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.SkyRocketEntityEffect;

public final class SkyrocketCommand extends CommandBase {
	
	public SkyrocketCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		SkyRocketEntityEffect effect = new SkyRocketEntityEffect(em, player);
		effect.start();
	}

}
