package fr.abrsra.onboarding_presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun ActionButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean,
    textStyle: TextStyle = MaterialTheme.typography.button
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = isEnabled,
        shape = RoundedCornerShape(100.dp), // TODO has to be externalized
    ) {
        Text(
            text = text,
            style = textStyle,
            color = MaterialTheme.colors.onPrimary,
            modifier = Modifier.padding(20.dp)
        )
    }
}