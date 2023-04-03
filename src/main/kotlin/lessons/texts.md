# Texts

A text is a sequence of characters. In Kotlin, a text is represented by the `String` class. A string is a sequence of characters. A string is immutable, i.e. it cannot be changed after it is created. Strings are compared by their content, not by their reference.

### Creating a string

A string is created by enclosing a sequence of characters in double quotes. The following example creates a string that contains the text "Hello, world!".

```kotlin
val text = "Hello, world!"
```

### Concatenating strings

Strings can be concatenated using the `+` operator. The following example concatenates two strings.

```kotlin
val text1 = "Hello, "
val text2 = "world!"
val text = text1 + text2
```

### Interpolating strings

Strings can be interpolated using the `$` operator. The following example interpolates a string.

```kotlin
val text = "Hello, world!"
val text = "The text is $text"
```

### String templates

String templates are strings that contain expressions. The following example creates a string template.

```kotlin
val text = "Hello, world!"
val text = "The text is ${text.toUpperCase()}"
```

### String literals

String literals are strings that contain escape sequences. The following example creates a string literal.

```kotlin
val text = "Hello, world!"
val text = "The text is \"${text.toUpperCase()}\""
```

## Essay

An essay is a text that contains a title and a body. The following example creates an essay.

```kotlin
val essay = """
    # An essay
    This is an essay.
""".trimIndent()
```

## Plain Text

Plain text is a text that contains no formatting. The following example creates a plain text.

```kotlin
val text = """
    This is a plain text.
""".trimIndent()
```

## Tweet

A tweet is a text that contains a username and a body. The following example creates a tweet.

```kotlin
val tweet = """
    @user This is a tweet.
""".trimIndent()
```

## Markdown

Markdown is a text that contains formatting. The following example creates a markdown.

```kotlin
val markdown = """
    # A markdown
    This is a markdown.
""".trimIndent()
```

## HTML

HTML is a text that contains formatting. The following example creates an HTML.

```kotlin
val html = """
    <h1>A HTML</h1>
    <p>This is a HTML.</p>
""".trimIndent()
```

## XML

XML is a text that contains formatting. The following example creates an XML.

```kotlin
val xml = """
    <root>
        <title>A XML</title>
        <body>This is a XML.</body>
    </root>
""".trimIndent()
```

## JSON

JSON is a text that contains formatting. The following example creates a JSON.

```kotlin
val json = """
    {
        "title": "A JSON",
        "body": "This is a JSON."
    }
""".trimIndent()
```

## YAML

YAML is a text that contains formatting. The following example creates a YAML.

```kotlin
val yaml = """
    title: A YAML
    body: This is a YAML.
""".trimIndent()
```
