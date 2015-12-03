package amidst.map;

import java.util.Arrays;
import java.util.List;

import amidst.map.widget.BiomeToggleWidget;
import amidst.map.widget.BiomeWidget;
import amidst.map.widget.CursorInformationWidget;
import amidst.map.widget.DebugWidget;
import amidst.map.widget.FpsWidget;
import amidst.map.widget.ScaleWidget;
import amidst.map.widget.SeedWidget;
import amidst.map.widget.SelectedIconWidget;
import amidst.map.widget.Widget;
import amidst.map.widget.Widget.CornerAnchorPoint;
import amidst.minecraft.world.World;

public class WidgetBuilder {
	private final World world;
	private final Map map;

	public WidgetBuilder(World world, Map map) {
		this.world = world;
		this.map = map;
	}

	public List<Widget> create(MapViewer mapViewer) {
		// @formatter:off
		return Arrays.asList(
				new FpsWidget(              mapViewer, map, world, CornerAnchorPoint.BOTTOM_LEFT),
				new ScaleWidget(            mapViewer, map, world, CornerAnchorPoint.BOTTOM_CENTER),
				new SeedWidget(             mapViewer, map, world, CornerAnchorPoint.TOP_LEFT),
				new DebugWidget(            mapViewer, map, world, CornerAnchorPoint.BOTTOM_RIGHT),
				new SelectedIconWidget(     mapViewer, map, world, CornerAnchorPoint.TOP_LEFT),
				new CursorInformationWidget(mapViewer, map, world, CornerAnchorPoint.TOP_RIGHT),
				new BiomeToggleWidget(      mapViewer, map, world, CornerAnchorPoint.BOTTOM_RIGHT),
				new BiomeWidget(            mapViewer, map, world, CornerAnchorPoint.NONE)
		);
		// @formatter:on
	}
}
