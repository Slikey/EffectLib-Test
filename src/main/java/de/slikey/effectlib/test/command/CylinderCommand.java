package de.slikey.effectlib.test.command;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.CylinderLocationEffect;
import org.bukkit.entity.Player;

public final class CylinderCommand extends CommandBase {

	public CylinderCommand(EffectManager em) {
		super(em);
	}

	@Override
	protected void effect(final Player player) {
		CylinderLocationEffect effect = new CylinderLocationEffect(em, player.getEyeLocation());
		effect.start();
	}

}
