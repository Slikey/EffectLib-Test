package de.slikey.effectlib.test.command;

import org.bukkit.entity.Player;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.VortexLocationEffect;

public final class VortexCommand extends CommandBase {
	
	public VortexCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		VortexLocationEffect effect = new VortexLocationEffect(em, player.getLocation());
		effect.start();
	}

}
