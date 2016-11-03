import java.util.Iterator;
TextBox _angleText;

final Iterator<Widget> iterator = _allPanel.iterator();
while (iterator.hasNext()) {
  Widget widget = iterator.next();
  if (widget instanceof TextBox) {
    TextBox element = (TextBox)widget;
    element.setEnabled(false);
  }        	
}

//but if there is another panel inside panel, it needs recursive, so it's up to you.
