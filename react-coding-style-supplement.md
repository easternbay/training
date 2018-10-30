# React coding style supplement

This document is a supplement for airbnb coding style.

### Split the import of 3rd party library with import in project with an blank line.

```javascript
import { Button, Row, Col } from 'antd';
import { Link } from 'react-router-dom';

import { FILTERS, ViewTypes } from '../constants';
```

### There should be an empty line bewteen functions inside Component.

```javascript
  handleChange = () => {
    // do something
  }

  render() {
    // return something
  }
```

### Use arrow functions to bind this context.

Instead of using `this.handleChange = this.handleChange.bind(this);` in constructor or render function, please use arrow functions like the following:

```javascript
  handleChange = () => {
    // do something
  }
```

**Reference:**
https://reactjs.org/docs/handling-events.html 

### Avoid use arrow functions and binds in render function.

```
<button onClick={() => this.handleViewTypeClick(ViewTypes.VIEW_AS_CARD)} >
</button>
```

The above function uses arrow functions for `onClick`, the problem of this usage is that it breaks performance optimizations like shouldComponentUpdate and PureComponent.

**Reference:**
https://medium.freecodecamp.org/why-arrow-functions-and-bind-in-reacts-render-are-problematic-f1c08b060e36

When passing value to method when you're using class public field arrow function way, you may meet the  inifinite update problem. To solve this problem, you can put the event handler into a sub component.

E.g.

Sub component

```javascript
class TableHeader extends Component {
  handleClick = () => {
    this.props.onHeaderClick(this.props.value);
  }

  render() {
    return (
      <th onClick={this.handleClick}>
        {this.props.column}
      </th>
    );
  }
}

```

Main component
```javascript
{this.props.defaultColumns.map((column) => (
  <TableHeader
    value={column}
    onHeaderClick={this.handleSort}
  />
))}
```

**Reference:**
https://stackoverflow.com/questions/29810914/react-js-onclick-cant-pass-value-to-method

### Avoid to add semicolon at the end of arrow functions in class

```javascript
// Bad
class A extends React.Component {
  handleClick = () => {
    // do something
  };
}

// Good
class A extends React.Component {
  handleClick = () => {
    // do something
  }
}

```

By reading through the React official doc, they don't add it too, but IDE might have an warning to show that you need to add it. Here's how to disable it in IDEA.
![Image](images/avoid-add-semicolon.png?raw=true)

### Functions should stay small

Each function should only do one thing a time to make the size managable, if the function grows big enough, it'll need to refactored. 

But remember one line function is not prefered either, since the purpose is to improve the code readability, the easier your code could be understand the better it is.

### Component files shouldn't long than 300 lines.

If the line size grows over 500, the code needs to be refactored before submit.

### If more than two components are quite the same, then it'll need to be refactored.

In this case, the duplication needs to be reduced as much as possible.
